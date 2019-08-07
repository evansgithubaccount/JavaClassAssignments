package com.example.blogproject.Controllers;

import com.example.blogproject.Dao.BlogPostDao;
import com.example.blogproject.domain.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping(method = RequestMethod.GET)
public class BlogPostController {

    @Autowired
    BlogPostDao bpdao;
    private List<BlogPost> posts;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("blogPost",newBlogPost());
        model.addAttribute("blogPostDao",new BlogPostDao());
        return "index";
    }

    private BlogPost newBlogPost(){
        return new BlogPost();
    }

    @GetMapping(value="/blog/new")
    public String newBlog(BlogPost blogPost){
        return "new";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createPost(@ModelAttribute("BlogPost") BlogPost post, BindingResult errors, Model model){
        bpdao.addPost(post);
        return "redirect:/newPost";
    }

    @RequestMapping(value = "/newPost", method = RequestMethod.POST)
    public String things(Model model){
        model.addAttribute("allPosts",bpdao.getPosts());
        return "postPage";
    }

    private void mirrorDB(){
        Iterable<BlogPost> blogList = bpdao.getPosts();
        posts.clear();
        for(BlogPost blog : blogList){
            posts.add(blog);
        }
    }

    @DeleteMapping("/blog_posts/{id}/delete")
    public String deleteBlogPost(@PathVariable("id") int id){
        bpdao.deleteById(id);
        mirrorDB();
        return "result";
    }

    @PutMapping("/blog_posts/{id}/edit")
    public String editBlogEntryPut(BlogPost bp, Model model, @PathVariable("id") int id){
        bpdao.addPost(bp);
        mirrorDB();
        model.addAttribute("title",bp.getTitle());
        model.addAttribute("author",bp.getAuthor());
        Model blogEntry = model.addAttribute("blogEntry",bp.getBlogEntry());
        return "result";
    }

//    @GetMapping("/blog_posts/{id}/edit")
//    public String editBlogEntryView(@PathVariable("id") int id, Model model){
//        Optional<BlogPost> optionalBlogPost;
//        model.addAttribute("blogPost",optionalBlogPost.get());
//        return "edit";
//    }
}

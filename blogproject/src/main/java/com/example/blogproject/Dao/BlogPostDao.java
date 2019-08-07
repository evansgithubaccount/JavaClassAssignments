package com.example.blogproject.Dao;

import com.example.blogproject.domain.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BlogPostDao {

    private static Map<Integer, BlogPost> blogposts;
    private static ArrayList<BlogPost> posts;

    public BlogPostDao(){
        blogposts = new HashMap<>();
        posts = new ArrayList<>();
    }

    public ArrayList<BlogPost> getPosts(){
        return posts;
    }

    public String getPostsAsString(){
        StringBuilder sb = new StringBuilder();
        for(BlogPost b : posts){
            sb.append(b.toString());
        }
        return sb.toString();
    }

    public void addPost(BlogPost post){
        blogposts.put(1,post);
        posts.add(post);
    }

    public void createPost(String title, String author, String entry){
        BlogPost newPost = new BlogPost(title,author,entry);
        blogposts.put(1,newPost);
    }

    public void deleteById(int id){
        posts.remove(id);
    }

    public BlogPost findById(int id){
        return posts.get(id);
    }
}

package com.example.blogproject.domain;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;

@Entity
public class BlogPost {

    //Annotations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private String blogEntry;

    public BlogPost(){}
    public BlogPost(String title, String author, String entry){
        this.title = title;
        this.author = author;
        this.blogEntry = entry;
    }

    public int getId() {return id;}

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}

    public String getBlogEntry() {return blogEntry;}
    public void setBlogEntry(String blogEntry) {this.blogEntry = blogEntry;}

    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", blogEntry='" + blogEntry + '\'' +
                '}';
    }
}

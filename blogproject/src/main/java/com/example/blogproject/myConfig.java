package com.example.blogproject;

import com.example.blogproject.domain.BlogPost;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;
import java.util.ArrayList;

@Configuration
public class myConfig {
    @Bean
    public ArrayList<BlogPost> posts(){
        return new ArrayList<>();
    }
}

package com.example.springExample.controller;

import com.example.springExample.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {


    @GetMapping("/")
   public String add(){
        return "add";
    }

    @GetMapping("/show")
    public String show(@RequestParam String title,
                       @RequestParam String description,
                       @RequestParam String author,
                       ModelMap modelMap){
        Post newPost = new Post(title,description,author);
        modelMap.put("newPost",newPost);
        return "show";
    }
}

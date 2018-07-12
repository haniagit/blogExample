package com.example.springExample.controller;

import com.example.springExample.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {


    @GetMapping("/main")
   public String add(){
        return "add";
    }

//    @GetMapping("/show")
//    public String show(@RequestParam String title,
//                       @RequestParam String description,
//                       @RequestParam String author,
//                       ModelMap modelMap){
//        Post post = new Post(title,description,author);
//        modelMap.put("post",post);
//        return "show";
//    }

//druga metoda do zamiany parametrów z klasy Post
    @GetMapping("/show")
    public String show(@ModelAttribute Post post, ModelMap modelMap){
        System.out.println("debug"+post);
        modelMap.put("post", post);
        return "show";
    }

    @GetMapping("/all")
    public String all(ModelMap modelMap){
        modelMap.put("posts", Post.findAll());
        return "all";
    }

}


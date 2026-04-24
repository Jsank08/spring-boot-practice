package com.example.spring_boot_practice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Spring Practice - thymeleaf");
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}

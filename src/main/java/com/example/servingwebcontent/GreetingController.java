package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Egor");
        return "home";
    }

    @GetMapping("/about")
    public String greeting(Model model) {
        return "grab";
    }
}
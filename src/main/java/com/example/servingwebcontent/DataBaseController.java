package com.example.servingwebcontent;

import com.example.models.News;
import com.example.repo.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataBaseController {

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping("/blog")
    public String database(Model model) {
        Iterable<News> news = newsRepository.findAll();
        model.addAttribute("news",news);
        return "databasemain";
    }
}

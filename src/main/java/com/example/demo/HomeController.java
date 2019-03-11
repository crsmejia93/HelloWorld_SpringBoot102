package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")

    public String homePage(Model model, Model model2){
        model.addAttribute("myvar","Say hello to the people.");
        //Second variable being submitted
        model2.addAttribute("myvar2", "Hi people");
        return "hometemplate";
    }
}

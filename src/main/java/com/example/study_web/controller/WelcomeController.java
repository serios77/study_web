package com.example.study_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    //http://localhost:8080/welcome?name=흐흐&age=1&showAge=true
    @GetMapping
    public String welcome(String name, int age, boolean showAge, Model model) {
        System.out.println("name : " + name + " age : " + age + "showAge" + showAge);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("showAge", showAge);
        return "welcome";
    }
}
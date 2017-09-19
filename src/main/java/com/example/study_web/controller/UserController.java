package com.example.study_web.controller;

import com.example.study_web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/create")
    public String create(User user, Model model) {
        System.out.println("User:" + user);

        model.addAttribute("userId", user.getUserId());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("name", user.getName());
        model.addAttribute("email", user.getEmail());
        return "created_user";
    }
}

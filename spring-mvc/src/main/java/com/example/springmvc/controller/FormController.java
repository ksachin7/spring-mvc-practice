package com.example.springmvc.controller;

import com.example.springmvc.model.User;
import com.example.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/register")
public class FormController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @GetMapping("/success")
    public String showSuccessPage(Model model) {
        if (!model.containsAttribute("user")) {
            return "redirect:/register";
        }
        return "success";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes) {
        System.out.println(user);
        userService.saveUser(user);
        redirectAttributes.addFlashAttribute("user", user);
        redirectAttributes.addFlashAttribute("successMessage", "Registration successful!");
        return "redirect:/register/success";
    }
}

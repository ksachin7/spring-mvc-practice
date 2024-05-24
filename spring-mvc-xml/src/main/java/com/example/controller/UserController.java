package com.example.controller;

import com.example.model.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    // using Command/Model Object
//    @GetMapping("/{id}")
//    public String index(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("message", "Hello, from Spring MVC");
//
//        LocalDateTime now= LocalDateTime.now();
//        model.addAttribute("time", now);
//
//        // Create a new User object and set the id
//        User user = new User();
//        user.setId(id);
//
//        // Add the User object to the model
//        model.addAttribute("user", user);
//
//        return "registerForm";
//    }

    //    @PostMapping("/processform")
//    public String handleFormData(User user, Model model){
//        System.out.println(user);
//
//        // Process the user data as needed
//        model.addAttribute("user", user);
//        return "success";
//    }

    // using ModelAttribute
    @ModelAttribute("user")
    public User populateUser() {
        return new User(); // Populate with default values
    }

    @GetMapping("/new")
    public String showForm() {
        // The user attribute is already added by the @ModelAttribute method
        return "registerForm";
    }

    @PostMapping("/processform")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("user", user);
        return "success";
    }

    // using CookieValue
    @GetMapping("/setCookie")
    public String setCookie(HttpServletResponse response) {
        Cookie userCookie = new Cookie("userId", "12345");
        userCookie.setPath("/");
        userCookie.setMaxAge(7 * 24 * 60 * 60); // 1 week
        response.addCookie(userCookie);
        return "setCookie";
    }

    @GetMapping("/showCookie")
    public String showCookie(@CookieValue(value = "userId", defaultValue = "defaultUserId") String userId, Model model) {
        model.addAttribute("userId", userId);
        return "showCookie";
    }
}

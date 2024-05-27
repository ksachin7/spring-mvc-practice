package com.example.springmvc.controller;

import com.example.springmvc.model.User;
import com.example.springmvc.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
        // This approach does not conditionally show the message only after a successful registration. Instead, it always adds the message, which is not the intended behavior.
//        model.addAttribute("successMessage", "Registration successful!");
        return "form";
    }

    @GetMapping("/success")
    public String showSuccessPage(Model model) {
        // Check if the model contains a "user" attribute
        if (!model.containsAttribute("user")) {
            // If not, redirect to the registration form
            return "redirect:/register";
        }
        return "success";
    }

    @PostMapping
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
           // Redirect: Creates a new request, losing any existing request attributes (including validation errors). So, you should forward to the registration page instead of redirecting.
            return "form";
        }
        System.out.println(user);
        userService.saveUser(user);
        // Add the user object and a success message to the RedirectAttributes
        // When you redirect from one controller method to another, the model attributes are not automatically carried over. This is because a redirect results in a new HTTP request, which means the model is reset. To persist attributes across redirects, you typically use RedirectAttributes.
        redirectAttributes.addFlashAttribute("user", user);
        redirectAttributes.addFlashAttribute("successMessage", "Registration successful!");
        return "redirect:/register/success";
    }
}

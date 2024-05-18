package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

//import java.util.logging.Logger;

@Controller
@RequestMapping("/")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/home")
    public String index(Model model) {
        System.out.println("at home");
        logger.info("working!");
        model.addAttribute("message", "Hello, from Spring MVC");
        return "home";
    }
}

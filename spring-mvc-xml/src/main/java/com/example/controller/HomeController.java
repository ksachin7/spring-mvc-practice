package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/practice")
    public String practice(Model model, ModelMap modelMap){
        System.out.println("at home");
        logger.info("working!");

        // Log messages at different log levels
        logger.trace("This is a TRACE message");
        logger.debug("This is a DEBUG message");
        logger.info("This is an INFO message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");

        model.addAttribute("message", "Hello, from Spring MVC");

        // utilizing ModelMap
        List<String> friends= new ArrayList<>();
        friends.add("Yash");
        friends.add("Chandan");
        friends.add("Sudarshan");
        modelMap.addAttribute("frnd", friends);

//      it can also be done by using model
//      model.addAttribute("frnd", friends);

        // Check if the attribute exists in the ModelMap
        boolean containsAttribute = modelMap.containsAttribute("message");
        System.out.println("Attribute 'message' exists in ModelMap: " + containsAttribute);

        // Remove the attribute from the ModelMap
        modelMap.remove("message");

        // Remove the attribute from the model
//        model.asMap().remove("message");

        // Check again if the attribute exists after removal
        containsAttribute = modelMap.containsAttribute("message");
        System.out.println("Attribute 'message' exists in ModelMap after removal: " + containsAttribute);

        // adding message again with modelMap
        modelMap.addAttribute("message", "Hello, from Spring MVC");

        LocalDateTime now= LocalDateTime.now();
        modelMap.addAttribute("time", now);
        return "practice";
    }

    // using ModelAndView
    @GetMapping("/signup")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.addObject("message", "Hello, from Spring MVC");

        LocalDateTime now= LocalDateTime.now();
        modelAndView.addObject("time", now);

        modelAndView.setViewName("signup");

        return modelAndView;
    }

}

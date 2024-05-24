package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
@RequestMapping
public class FormController {

    private static final Logger log = LoggerFactory.getLogger(FormController.class);

    // using ModelAndView
//    @GetMapping("/user/new")
//    public ModelAndView index(ModelAndView modelAndView) {
//        modelAndView.addObject("message", "Hello, from Spring MVC");
//
//        LocalDateTime now= LocalDateTime.now();
//        modelAndView.addObject("time", now);
//
//        // setting view name
//        modelAndView.setViewName("registerForm");
//
//        return modelAndView;
//    }

    /**
     * Data can be fetched from views (e.g., JSP pages, Thymeleaf templates, etc.) and passed to the controller in several ways.
     *
     * @RequestParam: Extract individual query or form parameters.
     * Command/Model Object: Bind all form fields to a JavaBean.
     * @PathVariable: Extract values from the URL path.
     * @RequestBody: Bind the request body to a Java object (useful for JSON).
     * @RequestHeader: Extract specific HTTP headers.
     * @CookieValue: Extract data from cookies.
     * Servlet API: Directly use HttpServletRequest and HttpSession.
     * @ModelAttribute: Bind method parameters or return values to model attributes.
     **/

    // using Servlet API
//    @RequestMapping(path = "/user/processform", method = RequestMethod.POST)
//    public String handleFormData(HttpServletRequest request){
//        String name= request.getParameter("fullName");
//        String email= request.getParameter("email");
//        System.out.printf("%s's email is: %s%n", name, email);
//        log.info("{}'s email is: {}", name, email);
//        return "";
//    }

    // using RequestParam
//    @RequestMapping(path = "/user/processform", method = RequestMethod.POST)
//    public ModelAndView handleFormData(@RequestParam("fullName") String fullName,
//                                       @RequestParam("email") String email,
//                                       @RequestParam("password") String password,
//                                       ModelAndView modelAndView){
//
////      model.addAttribute("id", id);
//        modelAndView.addObject("fullName", fullName);
//        modelAndView.addObject("email", email);
//
//        // logging data
//        log.info("{}'s email id is: {}", fullName, email);
//        System.out.printf("%s's email is: %s%n", fullName, email);
//        System.out.println("Password: "+ password);
//
//        // setting view name
//        modelAndView.setViewName("success");
//
//        return modelAndView;
//    }
}

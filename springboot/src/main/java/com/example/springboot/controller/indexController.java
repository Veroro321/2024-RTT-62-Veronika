package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView response = new ModelAndView("index");
        //this function is for the home page of hte website which is express as just a plain slash "/"
        response.addObject("message", "Hello World!");


        return response;
    }

    @GetMapping("/page-url") //this is what you type in the url, example http://localhost:8080/page-url
    public ModelAndView anotherPage() {
        ModelAndView response = new ModelAndView("another-page");

        return response;
    }
}

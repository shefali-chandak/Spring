package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {


    @RequestMapping("/hello")
    public ModelAndView helloWord() {
       // System.out.println("Hii");
        String message ="Hello Spring MVC";
        return new ModelAndView("hello", "message", message);
    }
}




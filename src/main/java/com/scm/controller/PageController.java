package com.scm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/services")
    public String services(){
        return "services";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/signup")
    public String signup(){
        return "register";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
}

package com.vismijatech.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    // index page
    @GetMapping({"/", "index"})
    public String openIndexPage(){
        return "index";
    }

    // login page
    @GetMapping("/login")
    public String openLoginPage(){
        return "login";
    }

    // register age
    @GetMapping("/register")
    public String openRegisterPage(){
        return "register";
    }
}

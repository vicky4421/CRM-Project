package com.vismijatech.main.controller;

import com.vismijatech.main.entity.User;
import com.vismijatech.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class UserController {
    // get user service reference
    @Autowired
    private UserService userService;

    // index page
    @GetMapping({"/", "index"})
    public String openIndexPage(){
        return "index";
    }

    // login page
    @GetMapping("/login")
    public String openLoginPage(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    // handle login
    @PostMapping("/loginForm")
    public String handleLogin(@ModelAttribute("user") User user, Model model){
        boolean isAuthenticated = userService.loginUser(user.getEmail(), user.getPassword());
        if (isAuthenticated) return "user-profile";
        else {
            model.addAttribute("errorMessage", "Incorrect Credentials!");
            return "login";
        }
    }

    // register age
    @GetMapping("/register")
    public String openRegisterPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    // handle registration form
    @PostMapping("/regForm")
    public String handleRegForm(@ModelAttribute("user") User user, Model model){
        if (userService.registerUser(user)){
            model.addAttribute("successMessage", "Registration Successful!");
            return "register";
        } else {
            model.addAttribute("errorMessage", "Registration Unsuccessful!");
            return "error";
        }
    }

    // logout
    @GetMapping("/logout")
    public String logout(SessionStatus status){
        status.setComplete();
        return "login";
    }
}

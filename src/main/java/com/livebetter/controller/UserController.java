package com.livebetter.controller;

import com.livebetter.model.User;
import com.livebetter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/signup"}, method = RequestMethod.GET)
    public String newUser(ModelMap model){
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }
    @RequestMapping(value = {"/signup"}, method = RequestMethod.POST)
    public String saveUser(User user, ModelMap model){
        userService.saveUser(user);
        return "success";
    }
}

package com.example.usersmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UsersController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String users() {
        return "users";
    }
}

package com.ouyang.controller;

import com.ouyang.pojo.Users;
import com.ouyang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(Users users) {
        userService.addUser(users);
        return "ok";
    }
}

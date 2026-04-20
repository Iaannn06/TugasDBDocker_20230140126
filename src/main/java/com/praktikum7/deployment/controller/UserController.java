package com.praktikum7.deployment.controller;


import com.praktikum7.deployment.model.User;
import com.praktikum7.deployment.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User request){
        userService.addUser(request);
        return "user created successfully";
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
}

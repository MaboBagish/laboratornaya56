package com.example.laboratornaya56.controller;

import com.example.laboratornaya56.model.User;
import com.example.laboratornaya56.service.UserService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Data
@RequestMapping
public class UserController {

    private final UserService userService;


    @PostMapping()
    public User registration(@RequestParam User user) {
        return userService.registration(user.getPassword(),user.getEmail());
    }


}

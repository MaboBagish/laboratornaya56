package com.example.laboratornaya56.controller;

import com.example.laboratornaya56.repository.UserRepository;
import com.example.laboratornaya56.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.web.bind.annotation.*;

@RestController
@Data
@RequestMapping("/users")
@AllArgsConstructor

public class UserController {
private final UserRepository userRepository;
    private final UserService userService;


    @PostMapping("/{email}/{password}/reg")
    public boolean registration(@PathVariable String email, @PathVariable String password) {

          return   userService.registration(email, password);

    }


}

package com.example.laboratornaya56.controller;

import com.example.laboratornaya56.model.User;
import com.example.laboratornaya56.repository.UserRepository;
import com.example.laboratornaya56.service.AuthUserDetailsService;
import com.example.laboratornaya56.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@Data
@RequestMapping("/users")
@AllArgsConstructor

public class UserController {
private final UserRepository userRepository;
    private final UserService userService;
private final AuthUserDetailsService authUserDetailsService;

    @PostMapping("/{email}/{password}/reg")
    public boolean registration(@PathVariable String email, @PathVariable String password) {

          return  authUserDetailsService.registration(email, password);

    }
    @GetMapping("/{users}")

    public List<User> findSubscriptions(Authentication authentication) {

        User user = (User) authentication.getPrincipal();

        return userService.findByEmail(user.getUsername());

    }





}

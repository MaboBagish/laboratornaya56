package com.example.laboratornaya56.service;

import com.example.laboratornaya56.model.User;
import com.example.laboratornaya56.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;





@Service
@AllArgsConstructor

public class UserService {

    private final UserRepository userRepository;


    public User registration(String password, String email) {
        return userRepository.save(new User(password, email));
    }
}

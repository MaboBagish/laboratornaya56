package com.example.laboratornaya56.service;

import com.example.laboratornaya56.model.User;
import com.example.laboratornaya56.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;





@Service
@AllArgsConstructor

public class UserService {

    private final UserRepository userRepository;


    public boolean registration(String password, String email) {
        if (userRepository.existsByEmail(email)) {

            return true;
        }else{
            userRepository.save(new User(password, email));
            return false;
        }
    }
}

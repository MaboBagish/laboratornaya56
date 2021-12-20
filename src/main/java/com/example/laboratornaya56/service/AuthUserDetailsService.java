package com.example.laboratornaya56.service;

import com.example.laboratornaya56.model.User;
import com.example.laboratornaya56.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optUser = userRepository.getByEmail(username);
        if (optUser.isEmpty()) {
            throw new UsernameNotFoundException("Not found");
        }
        return optUser.get();
    }
    public boolean registration(String password, String email) {
        if (userRepository.existsByEmail(email)) {

            return true;
        }else{
            userRepository.save(new User(password, email));
            return false;
        }
    }
}

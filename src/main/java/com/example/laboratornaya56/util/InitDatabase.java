package com.example.laboratornaya56.util;

import com.example.laboratornaya56.model.User;
import com.example.laboratornaya56.repository.TaskRepository;
import com.example.laboratornaya56.repository.UserRepository;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;



@AllArgsConstructor
@Configuration
public class InitDatabase {

    private final UserRepository userRepository;
    private final TaskRepository taskRepository;

    // раскомменитруйте следующие строки
    // когда создадите репозиторий пользователя
    // и сервис авторизации

    private final PasswordEncoder encoder;

    @Bean
    public CommandLineRunner fillData() {
        return (args) -> {
            taskRepository.deleteAll();

            // раскомменитруйте следующие строки
            // когда создадите репозиторий пользователя
            // и сервис авторизации
            userRepository.deleteAll();

            User user1 = new User();
            user1.setEmail("test@test");
            user1.setPassword(encoder.encode("test"));
            userRepository.save(user1);

            User user2 = new User();
            user2.setEmail("guest@test");
            user2.setPassword(encoder.encode("guest"));
            userRepository.save(user2);

            User user3 = new User();
            user3.setEmail("admin@test");
            user3.setPassword(encoder.encode("admin"));
            userRepository.save(user3);

        };
    }
}

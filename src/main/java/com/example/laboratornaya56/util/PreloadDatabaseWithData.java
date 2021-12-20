//package com.example.laboratornaya56.util;
//
//import com.example.laboratornaya56.model.Task;
//import com.example.laboratornaya56.model.User;
//import com.example.laboratornaya56.repository.TaskRepository;
//import com.example.laboratornaya56.repository.UserRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//import java.util.Random;
//import java.util.stream.Stream;
//
//import static java.util.stream.Collectors.toList;
//
//@Configuration
//public class PreloadDatabaseWithData {
//
//    private static final Random r = new Random();
//
//    @Bean
//    CommandLineRunner init(UserRepository userRepo, TaskRepository taskRepo) {
//        return (args) -> {
//
//
//            userRepo.deleteAll();
//            taskRepo.deleteAll();
//
//
//            List<User> users = Stream.generate(User::random)
//                    .limit(10)
//                    .collect(toList());
//            List<Task> tasks = Stream.generate(Task::random)
//                    .limit(10)
//                    .collect(toList());
//
//
//            userRepo.saveAll(users);
//            taskRepo.saveAll(tasks);
//        };
//    }
//
//
//
//
//}
//
//
//

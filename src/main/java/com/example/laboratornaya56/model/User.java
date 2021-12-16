package com.example.laboratornaya56.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;


    public User(String password, String email) {
    }
}

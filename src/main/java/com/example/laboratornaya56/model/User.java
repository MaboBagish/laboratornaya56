package com.example.laboratornaya56.model;

import com.example.laboratornaya56.util.Generator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
@AllArgsConstructor
@Builder
public class User {
    public static User random() {
        return builder()
                .email(Generator.makeEmail())
                .name(Generator.makeName())
                .password(Generator.makePassword())
                .build();
    }
    @Id
    private String id;
    private String name;
    private String email;
    private String password;


    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }
}

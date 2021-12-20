package com.example.laboratornaya56.model;

import com.example.laboratornaya56.util.Generator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Data
@Builder
@Document(collection = "tasks")
@AllArgsConstructor
public class Task {



    public static Task random() {

        return builder()

                .heading(Generator.makeHeading())
                .description(Generator.makeDescription())
//                .user(new User("bagish"))

                .build();
    }

    @Id
    private String id;
    private String heading;
    private String description;
    private LocalDate dateStart;
    @DBRef
    private User user;
    private String[] status = {"NEW","INWORK","COMPLETED"};


}

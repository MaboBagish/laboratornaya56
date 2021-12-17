package com.example.laboratornaya56.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Data
@Document(collection = "tasks")
@AllArgsConstructor
public class Task {


    @Id
    private String id;
    private String heading;
    private String description;
    private LocalDate dateStart;
    @DBRef
    private User nameByJob;
    private String[] status = {"NEW","INWORK","COMPLETED"};


}

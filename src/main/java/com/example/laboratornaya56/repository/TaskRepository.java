package com.example.laboratornaya56.repository;

import com.example.laboratornaya56.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, String> {
}

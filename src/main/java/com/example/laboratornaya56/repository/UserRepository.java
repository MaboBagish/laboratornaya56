package com.example.laboratornaya56.repository;

import com.example.laboratornaya56.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface UserRepository extends CrudRepository<User, String> {

Optional<User> getByEmail(String email);
boolean existsByEmail(String email);
    List<User> findByEmail(String email);
}

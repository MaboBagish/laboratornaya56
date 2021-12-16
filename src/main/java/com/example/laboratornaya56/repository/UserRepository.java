package com.example.laboratornaya56.repository;

import com.example.laboratornaya56.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
@RequestMapping
public interface UserRepository extends CrudRepository<User, String> {




}

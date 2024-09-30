package com.example.security.Spring_Security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.Spring_Security.model.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUserName(String userName);
}

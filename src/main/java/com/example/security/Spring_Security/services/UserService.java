package com.example.security.Spring_Security.services;

import com.example.security.Spring_Security.dtos.UserDTO;
import com.example.security.Spring_Security.model.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);
}
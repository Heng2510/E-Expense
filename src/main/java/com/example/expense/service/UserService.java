package com.example.expense.service;

import com.example.expense.dto.request.UserCreationRequest;
import com.example.expense.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(UserCreationRequest request);
    Optional<User> getUserByUsername(String username);
    List<User> getAllUsers();
}

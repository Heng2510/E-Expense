package com.example.expense.controller;

import com.example.expense.dto.request.UserCreationRequest;
import com.example.expense.dto.response.ApiResponse;
import com.example.expense.entity.User;
import com.example.expense.service.UserService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {
    UserService userService;

    @PostMapping("/create-user")
    ApiResponse<User> createUserRequest(@RequestBody @Valid UserCreationRequest request) {
        return ApiResponse
                .<User>builder()
                .data(userService.createUser(request))
                .build();
    }

    @GetMapping("/get-user")
    ApiResponse<List<User>> getAllUsersByLastName() {
        return ApiResponse
                .<List<User>>builder()
                .data(userService.getAllUsers())
                .build();
    }
}

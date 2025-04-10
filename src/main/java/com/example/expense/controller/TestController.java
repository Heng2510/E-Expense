package com.example.expense.controller;

import com.example.expense.dto.response.ApiResponse;
import com.example.expense.entity.Expense;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    @GetMapping("/hello")
//    public ApiResponse<String> hello() {
//        ApiResponse<String> apiResponse = new ApiResponse<>();
//        apiResponse.setData("test");
//        return apiResponse;
//    }
//
//    @GetMapping("/expense")
//    public ApiResponse<Expense> expense() {
//        ApiResponse<Expense> apiResponse = new ApiResponse<>();
//        apiResponse.setData(Expense.builder().title("Test Title").build());
//        return apiResponse;
//    }
}

package com.example.expense.service.impl;

import com.example.expense.dto.request.UserCreationRequest;
import com.example.expense.dto.response.UserResponse;
import com.example.expense.entity.User;
import com.example.expense.exception.AppException;
import com.example.expense.exception.ErrorCode;
import com.example.expense.mapper.UserMapper;
import com.example.expense.repository.UserRepository;
import com.example.expense.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    UserMapper userMapper;

    @Override
    public UserResponse createUser(UserCreationRequest request) {
        User user = userMapper.toUser(request);
        if (userRepository.existsByUsername(request.getUsername()))
            throw new AppException(ErrorCode.USER_EXISTED);;
        user = userRepository.save(user);
        return userMapper.toUserResponse(user);
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}

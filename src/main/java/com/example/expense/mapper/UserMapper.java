package com.example.expense.mapper;

import com.example.expense.dto.request.UserCreationRequest;
import com.example.expense.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

// DI for spring model
//
//
// the generated mapper is a Spring bean and can be retrieved via @Autowire (Documents)
@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
}

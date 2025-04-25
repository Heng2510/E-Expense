package com.example.expense.mapper;

import com.example.expense.dto.request.RoleRequest;
import com.example.expense.dto.response.RoleResponse;
import com.example.expense.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}

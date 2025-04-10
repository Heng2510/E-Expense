package com.example.expense.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    String id;
    @Size(min = 4, message = "USERNAME_INVALID")
    String username;
    String firstName;
    String lastName;
    String email;

    String password;
    LocalDate dob;
}

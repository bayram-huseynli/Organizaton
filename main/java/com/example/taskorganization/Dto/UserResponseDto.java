package com.example.taskorganization.Dto;

import lombok.Data;

@Data
public class UserResponseDto {
    private long id;

    String name;
    String surname;
    String email;
    String password;
}

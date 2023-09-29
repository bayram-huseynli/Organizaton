package com.example.taskorganization.Service;

import com.example.taskorganization.Dto.UserRequestDto;
import com.example.taskorganization.Dto.UserResponseDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserServiceImpl {
    List<UserResponseDto> findAll();
    void createUser(UserRequestDto userRequestDto);
     UserResponseDto getById(Long id);
    UserRequestDto update(Long id, UserRequestDto userRequestDto);
}

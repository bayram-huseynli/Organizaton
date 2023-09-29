package com.example.taskorganization.Controller;

import com.example.taskorganization.Dto.UserRequestDto;
import com.example.taskorganization.Dto.UserResponseDto;
import com.example.taskorganization.Service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserServiceImpl userServiceImpl;


    @GetMapping
    public List<UserResponseDto> findAll(){
        return userServiceImpl.findAll();
    }
    @PostMapping()
    public void create(@RequestBody UserRequestDto userRequestDto){
        userServiceImpl.createUser(userRequestDto);

    }
    @GetMapping("/id")
    public UserResponseDto getById(@PathVariable Long id){
        return userServiceImpl.getById(id);
    }
    @PutMapping("/id")
    public UserRequestDto update(@PathVariable Long id,UserRequestDto userRequestDto){
        return userServiceImpl.update(id,userRequestDto);
    }


}

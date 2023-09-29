package com.example.taskorganization.Service;

import com.example.taskorganization.Dto.UserRequestDto;
import com.example.taskorganization.Dto.UserResponseDto;
import com.example.taskorganization.Entity.User;
import com.example.taskorganization.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService implements UserServiceImpl{

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    public List<UserResponseDto> findAll(){
        return userRepository
                .findAll()
                .stream()
                .map(user -> modelMapper.map(user,UserResponseDto.class))
                .toList();
    }
    public void createUser(UserRequestDto userRequestDto){
        User user=modelMapper.map(userRequestDto,User.class);
        userRepository.save(user);
    }
    public UserResponseDto getById(Long id){
        User user=userRepository.findById(id).orElseThrow(()-> new RuntimeException());
        return modelMapper.map(user,UserResponseDto.class);
    }
    public UserRequestDto update(Long id, UserRequestDto userRequestDto){
        User user=userRepository.findById(id).get();
        user.setName(userRequestDto.getName());
        user.setEmail(userRequestDto.getEmail());
        user.setSurname(userRequestDto.getSurname());
        user.setPassword(userRequestDto.getPassword());
          userRepository.save(user);
          return userRequestDto;

    }

}

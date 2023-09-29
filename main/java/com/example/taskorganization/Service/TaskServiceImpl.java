package com.example.taskorganization.Service;

import com.example.taskorganization.Dto.TaskRequestDto;
import com.example.taskorganization.Dto.TaskResponseDto;

import java.util.List;

public interface TaskServiceImpl {

    void createTask(TaskRequestDto taskRequestDto);
    List<TaskResponseDto> findAll();
    TaskResponseDto getById(Long id);
    TaskRequestDto update(Long id, TaskRequestDto taskRequestDto);
}

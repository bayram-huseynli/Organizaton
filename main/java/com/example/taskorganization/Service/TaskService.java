package com.example.taskorganization.Service;

import com.example.taskorganization.Dto.TaskRequestDto;
import com.example.taskorganization.Dto.TaskResponseDto;
import com.example.taskorganization.Entity.Task;
import com.example.taskorganization.Repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService implements TaskServiceImpl{

    private final ModelMapper modelMapper;
    private final TaskRepository taskRepository;
    @Override
    public List<TaskResponseDto> findAll(){
        return taskRepository
                .findAll()
                .stream()
                .map(task -> modelMapper.map(task,TaskResponseDto.class))
                .toList();

    }

    @Override
    public void createTask(TaskRequestDto taskRequestDto){
        Task task=modelMapper.map(taskRequestDto,Task.class);
        taskRepository.save(task);
    }
    @Override
    public TaskResponseDto getById(Long id){
        Task task=taskRepository.findById(id).orElseThrow(()-> new RuntimeException());
        return modelMapper.map(task,TaskResponseDto.class);
    }
    @Override
    public TaskRequestDto update(Long id, TaskRequestDto taskRequestDto) {
        Task task = taskRepository.findById(id).get();
        task.setName((taskRequestDto.getName()));
        task.setDeadline(taskRequestDto.getDeadline());
        task.setDescription(taskRequestDto.getDescription());
         taskRepository.save(task);
        return taskRequestDto;
    }










}

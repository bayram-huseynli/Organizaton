package com.example.taskorganization.Controller;

import com.example.taskorganization.Dto.TaskRequestDto;
import com.example.taskorganization.Dto.TaskResponseDto;
import com.example.taskorganization.Service.TaskServiceImpl;
import lombok.RequiredArgsConstructor;
import org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {
    private final TaskServiceImpl taskServiceImpl;


    @GetMapping
    public List<TaskResponseDto> findAll() {
        return taskServiceImpl.findAll();
    }

    @PostMapping()
    public void create(@RequestBody TaskRequestDto taskRequestDto){
        taskServiceImpl.createTask(taskRequestDto);
    }
    @GetMapping("/id")
    public TaskResponseDto getById(@PathVariable Long id){
        return taskServiceImpl.getById(id);
    }
    @PutMapping("/id")
    public TaskRequestDto update(@PathVariable Long id,TaskRequestDto taskRequestDto){
        return taskServiceImpl.update(id,taskRequestDto);
    }






}

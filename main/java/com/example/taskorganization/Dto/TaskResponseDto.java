package com.example.taskorganization.Dto;

import com.example.taskorganization.Entity.Status;
import lombok.Data;

import java.time.LocalDate;
@Data
public class TaskResponseDto {
    private long id;

    String name;
    Enum<Status> statusEnum;
    LocalDate deadline;
    String description;
}

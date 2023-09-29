package com.example.taskorganization.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
@Entity
@Data
@Table(name="tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    String name;
    Enum<Status> statusEnum;
    LocalDate deadline;
    String description;
}

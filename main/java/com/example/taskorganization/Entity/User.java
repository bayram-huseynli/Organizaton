package com.example.taskorganization.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    String name;
    String surname;
    String email;
    String password;
}
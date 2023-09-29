package com.example.taskorganization.Repository;

import com.example.taskorganization.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}

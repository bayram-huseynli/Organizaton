package com.example.taskorganization.Repository;

import com.example.taskorganization.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

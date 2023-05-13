package com.example.ToDoList.repository;

import com.example.ToDoList.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// DB CRUD interface
@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> { // Entiry, type of id

}

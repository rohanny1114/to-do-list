package com.example.ToDoList.repository;

import com.example.ToDoList.domain.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// DB CRUD interface
@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Long> { // Entity, type of id
    @Modifying
    @Transactional
    @Query(value = "TRUNCATE TABLE todo", nativeQuery = true)
    void truncateTable();

}

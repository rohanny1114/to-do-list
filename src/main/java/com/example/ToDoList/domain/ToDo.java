// 실제로는 DB에 저장이 되는 클라스
package com.example.ToDoList.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "ToDo")
@Table(name = "todo") // Connect to todo-table
// By Lombok: Auto create No-args and Parameterized constructor
@NoArgsConstructor
@AllArgsConstructor
// By Lombok: Auto create Setters and Getters
@Setter
@Getter


public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String todo;
}

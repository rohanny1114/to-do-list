package com.example.ToDoList.controller;

import com.example.ToDoList.domain.ToDo;
import com.example.ToDoList.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoRepository toDoRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<ToDo> todos = toDoRepository.findAll();
        model.addAttribute("todos", todos); // save in "todos".html a todos
        return "todos";
    }
    @PostMapping("/addTodo")
    public String addTodo(@RequestParam("todo") String todo) {
         System.out.println(todo); // Test parsing data

        // Save input tasks
        ToDo toDo = new ToDo();
        toDo.setTodo(todo);
        toDoRepository.save(toDo);

        return "redirect:/";
    }

    @PostMapping("/emptyTodo")
    public String emptyTodo(@RequestParam("todo") String todo){
        System.out.println("[System] Empty table");

        // Empty a table
        ToDo toDo = new ToDo();
        toDo.setTodo(todo);
        toDoRepository.truncateTable();
        return "redirect:/";
    }

}


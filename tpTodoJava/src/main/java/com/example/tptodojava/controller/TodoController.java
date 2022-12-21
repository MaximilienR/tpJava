package com.example.tptodojava.controller;

import com.example.tptodojava.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class TodoController {

    @Autowired
    TodoService todoService;

    @PostMapping("/post")
    public Todo newPost(@RequestBody Todo todo){return todo;  }

    //delete

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable("id")Integer id){
        Todo t =
    }
}

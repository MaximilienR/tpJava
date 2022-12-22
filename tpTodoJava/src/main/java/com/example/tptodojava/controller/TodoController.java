package com.example.tptodojava.controller;

import com.example.tptodojava.entity.Todo;
import com.example.tptodojava.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.sun.beans.introspect.PropertyInfo.Name.description;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

@Controller
@RequestMapping("/todo")
public final class TodoController {

@Autowired
private TodoService _todoService;


    @PostMapping("/post")
    public Todo newPost(@RequestBody String title,@RequestParam String description) throws Exception {
        try {
            Todo todo = _todoService.createTodo(title, description);
            return todo;
        } catch (Exception exception) {
            throw exception;
        }
    }
    //update

    @

    //delete

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable("id")Integer id){
        Todo t =
    }
}

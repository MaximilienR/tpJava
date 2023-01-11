package com.example.tp_dto_spring.controller;

import com.example.tp_dto_spring.dto.CommentDTO;
import com.example.tp_dto_spring.service.impl.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/comment")
public class CommentsController {

    @Autowired
    private CommentService _commentService;

    
}

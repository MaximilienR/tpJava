package com.example.tp_dto_spring.controller;

import com.example.tp_dto_spring.dto.CommentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/comment")
public class CommentsController {

    @PostMapping("/comment")
    public ResponseEntity<CommentsController> creatComment(@RequestBody CommentDTO commentDTO){
        if(commentDTO.getId()!=null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        _com
    }
}

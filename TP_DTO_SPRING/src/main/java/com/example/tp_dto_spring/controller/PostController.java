package com.example.tp_dto_spring.controller;

import com.example.tp_dto_spring.dto.PostDto;
import com.example.tp_dto_spring.service.impl.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/post")
public class PostController {

    @Autowired
    private PostService _postService;


}

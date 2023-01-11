package com.example.tp_dto_spring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class PostUpdateDto implements  PostDto{

    private  Integer id;
    private  String content;
    private  String description;
    private  String title;
}

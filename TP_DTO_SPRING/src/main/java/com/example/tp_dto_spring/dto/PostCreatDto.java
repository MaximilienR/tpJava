package com.example.tp_dto_spring.dto;

public class PostCreatDto implements  PostDto{

    private  String content;
    private  String description;
    private  String title;

    public PostCreatDto(String content, String description, String title) {
        this.content = content;
        this.description = description;
        this.title = title;
    }

    public  PostCreatDto(){
        //constructor vide
    }
}

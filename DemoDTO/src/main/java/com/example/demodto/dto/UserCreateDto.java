package com.example.demodto.dto;

public class UserCreateDto implements  UserDto{
    private  String name;

    private  String email;

    private String password;

    public UserCreateDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserCreateDto() {

        //constructor vide
    }


}

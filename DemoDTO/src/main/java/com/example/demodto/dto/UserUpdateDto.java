package com.example.demodto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class UserUpdateDto implements  UserDto{
    private  Integer id;
    private  String name;
    private  String email;
}

package com.example.demodto.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class UserReadDto implements UserDto{

    private  Integer id;

    private  String email;

    private  String name;
}

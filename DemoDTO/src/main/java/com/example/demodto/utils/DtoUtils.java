package com.example.demodto.utils;

import com.example.demodto.dto.UserDto;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;

public class DtoUtils {
    public UserDto convertToDto(User user,UserDto userDto){
        return  new ModelMapper().map(user,userDto.getClass());
    }

    public User convertToEntity(User user, UserDto userDto){
        return  new  ModelMapper().map(userDto, user.getClass());
    }
}

package com.example.demodto.service.impl;

import com.example.demodto.dto.UserDto;

public interface UserService implem {

    public UserDto createUser(UserDto userDto);

    public UserDto readUser(Integer id);
}

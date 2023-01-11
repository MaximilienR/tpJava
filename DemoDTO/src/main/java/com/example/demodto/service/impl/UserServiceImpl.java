package com.example.demodto.service.impl;

import com.example.demodto.dto.UserDto;
import com.example.demodto.repository.UserRepository;
import com.example.demodto.utils.DtoUtils;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;



    @Override
    public UserDto createUser(UserDto userDto){
            User user= dtoUtils.convertToEntity(new User(),userDto);
            User user1=userRepository.save(user):
        //    userRepository.save(user);

            return dtoUtils.convertT ;
    }

    @Override
    public UserDto readUser(Integer id) {
        return dtoUtils.covertToDto(userRepository.findById().get().new UserReadDto());
    }
    @Override
    public userDto updateUser(UserDto userDto, Integer id){return ;}
}

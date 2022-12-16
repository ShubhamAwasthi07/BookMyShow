package com.example.BookMyShow.Controller;

import com.example.BookMyShow.Model.UserEntity;
import com.example.BookMyShow.dto.UserDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {

    public static UserEntity dtoToEntity(UserDto userDto){

        return UserEntity.builder().name(userDto.getName()).mobile(userDto.getMobile()).build();
    }

    public static UserDto entityToDTO(UserEntity userEntity){
        return UserDto.builder().id(userEntity.getId()).name(userEntity.getName()).mobile(userEntity.getMobile()).build();
    }

}


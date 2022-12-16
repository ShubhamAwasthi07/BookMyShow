package com.example.BookMyShow.Service;

import com.example.BookMyShow.dto.UserDto;

public interface UserService {

    //Add
    public void addUser(UserDto userDto);

    //Get
    public UserDto getUser(int id);
}

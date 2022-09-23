package com.perakladau.polyclinic.service;

import com.perakladau.polyclinic.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {

    UserDto createUser(UserDto userDto);
    UserDto getUser(UUID uuid);
    List<UserDto> getAllUsers();
}

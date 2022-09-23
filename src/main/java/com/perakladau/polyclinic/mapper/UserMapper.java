package com.perakladau.polyclinic.mapper;

import com.perakladau.polyclinic.dto.UserDto;
import com.perakladau.polyclinic.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDto toDomain(User user);
    User toRepository(UserDto userDto);
    List<UserDto> toDomain(List<User> users);

}

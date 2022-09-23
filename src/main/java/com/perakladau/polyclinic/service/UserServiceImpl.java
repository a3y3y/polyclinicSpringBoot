package com.perakladau.polyclinic.service;

import com.perakladau.polyclinic.dto.UserDto;
import com.perakladau.polyclinic.entity.User;
import com.perakladau.polyclinic.mapper.UserMapper;
import com.perakladau.polyclinic.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = userMapper.toRepository(userDto);
        user.setUuid(UUID.randomUUID());
        return userMapper.toDomain(userRepository.save(user));
    }

    @Override
    public UserDto getUser(UUID uuid) {
        return userMapper.toDomain(userRepository.findByUuid(uuid));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userMapper.toDomain(userRepository.findAll());
    }
}

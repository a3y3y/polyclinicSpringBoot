package com.perakladau.polyclinic.controller;

import com.perakladau.polyclinic.dto.UserDto;
import com.perakladau.polyclinic.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/private/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{uuid}")
    public ResponseEntity<UserDto> getUser(@PathVariable(name = "uuid") UUID uuid) {
        return new ResponseEntity<UserDto>(userService.getUser(uuid), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return new ResponseEntity<List<UserDto>>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<UserDto> createUser(@RequestBody() UserDto userDto) {
        return new ResponseEntity<UserDto>(userService.createUser(userDto), HttpStatus.CREATED);
    }
}

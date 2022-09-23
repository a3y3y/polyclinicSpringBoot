package com.perakladau.polyclinic.controller;

import com.perakladau.polyclinic.dto.PassportDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/private/v1/passport")
public class PassportController {

    @GetMapping("/{uuid}")
    public ResponseEntity<PassportDto> getPassport(@PathVariable(name = "uuid") UUID uuid) {
        return new ResponseEntity<>(new PassportDto(), HttpStatus.CREATED);
    }
}

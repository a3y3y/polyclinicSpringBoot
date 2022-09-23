package com.perakladau.polyclinic.controller;

import com.perakladau.polyclinic.dto.AddressDto;
import com.perakladau.polyclinic.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("private/v1/address")
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/{id}")
    public ResponseEntity<AddressDto> read(@PathVariable(name = "uuid") UUID uuid) {
        AddressDto address = addressService.getAddress(uuid);

        return address != null
                ? new ResponseEntity<>(address, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

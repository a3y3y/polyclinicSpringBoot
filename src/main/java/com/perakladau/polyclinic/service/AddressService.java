package com.perakladau.polyclinic.service;

import com.perakladau.polyclinic.dto.AddressDto;

import java.util.UUID;

public interface AddressService {
    AddressDto getAddress(UUID uuid);
}

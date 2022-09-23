package com.perakladau.polyclinic.service;

import com.perakladau.polyclinic.dto.AddressDto;
import com.perakladau.polyclinic.entity.Address;
import com.perakladau.polyclinic.mapper.AddressMapper;
import com.perakladau.polyclinic.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService{

    private final AddressMapper mapper;
    private final AddressRepository addressRepository;

    @Override
    public AddressDto getAddress(UUID uuid) {
        Address address = addressRepository.findByUuid(uuid).orElseThrow(() ->
                new NoSuchElementException("Address with uuid=" + uuid + "doesn't exist"));
        return mapper.toDomain(address);
    }
}

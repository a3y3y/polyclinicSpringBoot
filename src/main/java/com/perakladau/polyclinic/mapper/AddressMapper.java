package com.perakladau.polyclinic.mapper;

import com.perakladau.polyclinic.dto.AddressDto;
import com.perakladau.polyclinic.entity.Address;
import org.mapstruct.Mapper;

@Mapper
public interface AddressMapper {

    AddressDto toDomain(Address address);

    Address toRepository(AddressDto addressDto);
}

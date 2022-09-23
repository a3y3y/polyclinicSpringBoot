package com.perakladau.polyclinic.mapper;

import com.perakladau.polyclinic.dto.PassportDto;
import com.perakladau.polyclinic.entity.Passport;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PassportMapper {

    PassportDto toDomain(Passport passport);

    @Mapping(target = "id", ignore = true)
    Passport toRepository(PassportDto passportDto);

}

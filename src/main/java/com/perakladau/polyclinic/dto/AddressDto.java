package com.perakladau.polyclinic.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class AddressDto {

    private UUID uuid;
    private String country;
    private String region;
    private String city;
    private String street;
    private String streetNumber;
    private String apartmentNumber;
    private String index;

}

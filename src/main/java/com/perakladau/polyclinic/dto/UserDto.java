package com.perakladau.polyclinic.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.UUID;

@Data
public class UserDto {

    private UUID uuid;
    private String phoneNumber;
    @JsonProperty("eMail")
    private String eMail;

}

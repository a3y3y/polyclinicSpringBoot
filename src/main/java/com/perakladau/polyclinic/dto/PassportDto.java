package com.perakladau.polyclinic.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class PassportDto {

    private UUID uuid;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String codeOfIssuingState;
    private String number;
    private String personalId;
    private String nationality;
    private String dateOfBirth;
    private String sex;
    private String issueDate;
    private String expireDate;

}

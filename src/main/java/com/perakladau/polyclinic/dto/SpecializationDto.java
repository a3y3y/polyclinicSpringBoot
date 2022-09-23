package com.perakladau.polyclinic.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class SpecializationDto {

    private UUID uuid;
    private String name;
    private String description;

}


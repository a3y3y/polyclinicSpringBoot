package com.perakladau.polyclinic.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
public class MedicalCardDto {

    private UUID uuid;
    private boolean healthful;
    private String userUuid;
    private Set<MedicalNoteDto> notes;

}

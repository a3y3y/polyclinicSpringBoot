package com.perakladau.polyclinic.dto;

import com.perakladau.polyclinic.entity.MedicalNoteType;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
public class MedicalNoteDto{

    private UUID uuid;
    private String medicalNoteType;
    private String name;
    private String illness;
    private String date;
    private String description;

}

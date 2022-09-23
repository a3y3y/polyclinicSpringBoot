package com.perakladau.polyclinic.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "MEDICAL_SERVICES")
public class MedicalNote implements Comparable<MedicalNote>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private UUID uuid;
    @Enumerated(EnumType.STRING)
    private MedicalNoteType type;
    private String name;
    private String illness;
    private String date;
    private String description;

    @ManyToOne
    @JoinColumn(name = "medical_card_id")
    private MedicalCard medicalCard;

    @Override
    public int compareTo(MedicalNote o) {
        return this.date.compareTo(o.getDate());
    }
}

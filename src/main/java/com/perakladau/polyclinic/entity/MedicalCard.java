package com.perakladau.polyclinic.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "MEDICAL_CARDS")
public class MedicalCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private UUID uuid;

    private boolean healthful;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "medicalCard")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "medicalCard")
    private Set<MedicalNote> notes;

}

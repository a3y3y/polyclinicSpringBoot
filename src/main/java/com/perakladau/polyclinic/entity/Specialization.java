package com.perakladau.polyclinic.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "SPECIALIZATIONS")
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private UUID uuid;

    private String name;

    private String description;

    @ManyToMany(mappedBy = "specializations")
    private List<DoctorInfo> doctorInfo = new ArrayList<>();

}


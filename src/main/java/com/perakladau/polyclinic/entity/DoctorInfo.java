package com.perakladau.polyclinic.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@Table(name = "DOCTOR_INFO")
public class DoctorInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private UUID uuid;

    @Column(name = "last_place_of_work")
    private String lastPlaceOfWork;

    @Column(name = "last_position")
    private String lastPosition;

    private String education;

    private Date experience;

    private byte rating;

    @OneToOne(mappedBy = "doctor")
    private User doctor;

    @ManyToMany
    @JoinTable(
            name = "specialization_doctor",
            joinColumns = {@JoinColumn(name = "doctor_info_id")},
            inverseJoinColumns = {@JoinColumn(name = "specialization_id")})
    private List<Specialization> specializations = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "department_doctor",
            joinColumns = {@JoinColumn(name = "doctor_info_id")},
            inverseJoinColumns = {@JoinColumn(name = "department_id")})
    private List<Department> departments = new ArrayList<>();

    @OneToMany(mappedBy = "doctor")
    private Set<Ticket> ticketsForDoctor;
}

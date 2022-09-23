package com.perakladau.polyclinic.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private UUID uuid;

    @Column(name = "phone_number")
    private String phoneNumber;


    @Column(unique = true, nullable = false)
    private String eMail;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id")
    private Passport passport;

    @OneToMany(mappedBy = "patient")
    private Set<Ticket> tickets;

    @OneToOne
    @JoinColumn(name = "doctor_info_id")
    private DoctorInfo doctor;

    @OneToOne
    @JoinColumn(name = "medical_card_id")
    private MedicalCard medicalCard;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "registration_id")
    private Address registrationAddress;
}

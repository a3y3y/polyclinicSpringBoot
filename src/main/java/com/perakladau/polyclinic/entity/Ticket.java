package com.perakladau.polyclinic.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Table(name = "TICKETS")
public class Ticket implements Comparable<Ticket>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private UUID uuid;

    private int number;

    private Date date;

    @Column(name = "office_number")
    private int officeNumber;

    @ManyToOne
    @JoinColumn(name = "patient")
    private User patient;

    @ManyToOne
    @JoinColumn(name = "doctor")
    private DoctorInfo doctor;

    @Override
    public int compareTo(Ticket o) {
        return date.compareTo(o.getDate());
    }
}

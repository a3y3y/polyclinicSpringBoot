package com.perakladau.polyclinic.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "ADDRESSES")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private UUID uuid;

    private String country;

    private String region;

    private String city;

    private String street;

    @Column(name = "street_number")
    private String streetNumber;

    @Column(name = "apartment_number")
    private String apartmentNumber;

    private String index;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "registrationAddress")
    private List<User> users;

}

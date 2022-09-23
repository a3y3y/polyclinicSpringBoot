package com.perakladau.polyclinic.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "PASSPORTS")
public class Passport implements Comparable<Passport>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private UUID uuid;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    private String patronymic;

    @Column(name = "code_of_issuing_state")
    private String codeOfIssuingState;

    private String number;
    @Column(name = "personal_id")
    private String personalId;

    private String nationality;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    private String sex;

    @Column(name = "issue_date")
    private String issueDate;

    @Column(name = "expire_date")
    private String expireDate;

//    @OneToOne(fetch = FetchType.EAGER, mappedBy = "passport")
//    private User user;

    @Override
    public int compareTo(Passport o) {
        return this.lastName.compareTo(o.getLastName());
    }
}

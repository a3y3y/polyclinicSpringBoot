package com.perakladau.polyclinic.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
public class TicketDto{

    private UUID uuid;
    private int number;
    private Date date;
    private int officeNumber;
    private UUID patientUuid;
    private String patientLastName;
    private String patientFirstName;
    private UUID doctorUuid;
    private String doctorLastName;
    private String doctorFirstName;

}

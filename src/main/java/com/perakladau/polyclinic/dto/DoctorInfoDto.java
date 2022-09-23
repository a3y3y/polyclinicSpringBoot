package com.perakladau.polyclinic.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Data
public class DoctorInfoDto {

    private UUID uuid;
    private String lastPlaceOfWork;
    private String lastPosition;
    private String education;
    private Date experience;
    private byte rating;

}

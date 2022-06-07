package com.example.assignment2.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class CustomerDto {
    private int id ;
    private String firstName ;
    private String lastName;
    private Date bornAt ;

}

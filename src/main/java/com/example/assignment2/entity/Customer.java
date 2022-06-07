package com.example.assignment2.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue
    private int id;

    @Column(columnDefinition = "TINYTEXT")
    private String firstName ;

    @Column(columnDefinition = "TINYTEXT")
    private String lastName;

    @Column(columnDefinition = "DATE" ,  name = "bornAt")
    private Date bornAt ;
}

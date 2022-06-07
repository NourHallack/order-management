package com.example.assignment2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.* ;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private int id;

    @Column(columnDefinition = "TINYTEXT")
    private String slug ;

    @Column(columnDefinition = "TINYTEXT")
    private String name;

    @Column(columnDefinition = "TINYTEXT")
    private String reference ;

    @Column(precision=10, scale=2, columnDefinition = "DECIMAL")
    private double price ;

    @Column(precision=10, scale=2, columnDefinition = "DECIMAL")
    private double vat ;

    private boolean stockable ;

}

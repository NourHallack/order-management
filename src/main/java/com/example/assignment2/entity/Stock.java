package com.example.assignment2.entity;


import java.sql.Date;

import javax.persistence.* ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "productId",referencedColumnName = "id")
    private  Product product;

    private int quantity ;

    @Column(columnDefinition = "DATETIME")
    private Date updateAt ;

}

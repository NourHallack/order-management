package com.example.assignment2.entity;

import java.util.Date;

import javax.persistence.* ;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "`order`")
public class Order {

    @Id
    @GeneratedValue
    private int id;


    @NotNull
    @Column
    private Date orderAt;

    @ManyToOne
    @JoinColumn(name = "customerId",referencedColumnName = "id")
    @NotNull
    private  Customer customer;

}

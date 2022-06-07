package com.example.assignment2.dto;



import lombok.Data;

import java.util.Date;

@Data
public class OrderDto {
    private int id ;
    private int customerId;
    private Date orderAt ;
}

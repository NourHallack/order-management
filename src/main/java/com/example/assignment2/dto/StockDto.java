package com.example.assignment2.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class StockDto {
    private int id ;
    private int productId ;
    private int quantity ;
    private Date updateAt ;
}

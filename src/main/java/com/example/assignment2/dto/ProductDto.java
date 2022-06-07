package com.example.assignment2.dto;

import lombok.Data;

@Data
public class ProductDto {
    private int id ;
    private String slug ;
    private String name ;
    private String reference ;
    private int price ;
    private int vat ;
    private boolean stockable ;
}

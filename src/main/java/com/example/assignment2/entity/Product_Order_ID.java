package com.example.assignment2.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Product_Order_ID implements Serializable {

    int orderId;
    int productId;

}

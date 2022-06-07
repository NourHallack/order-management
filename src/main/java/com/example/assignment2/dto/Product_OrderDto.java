package com.example.assignment2.dto;

import com.example.assignment2.entity.Order;
import com.example.assignment2.entity.Product;
import com.example.assignment2.entity.Product_Order_ID;
import lombok.Data;

@Data
public class Product_OrderDto {
    private Product_Order_ID id;
    private Order order;
    private Product product;
    private int quantity ;
    private int price ;
    private int vat ;
}

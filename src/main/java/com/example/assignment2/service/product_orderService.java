package com.example.assignment2.service;

import com.example.assignment2.dto.Product_OrderDto;
import com.example.assignment2.entity.Product_Order_ID;

import java.util.List;

public interface product_orderService {

    Product_OrderDto createProductOrder(Product_OrderDto ProductOrderDto);

    List<Product_OrderDto> getAllProductOrders();

    Product_OrderDto getProductOrderById(Product_Order_ID id);

    Product_OrderDto updateProductOrder(Product_OrderDto ProductOrderDto, Product_Order_ID id);

    void deleteProductOrderById(Product_Order_ID id);
}

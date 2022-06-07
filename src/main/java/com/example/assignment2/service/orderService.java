package com.example.assignment2.service;

import com.example.assignment2.dto.OrderDto;

import java.util.List;

public interface orderService {

    OrderDto createOrder(OrderDto OrderDto);

    List<OrderDto> getAllOrders();

    OrderDto getOrderById(int id);

    OrderDto updateOrder(OrderDto OrderDto, int id);

    void deleteOrderById(int id);
}

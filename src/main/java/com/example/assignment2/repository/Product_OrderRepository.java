package com.example.assignment2.repository;

import com.example.assignment2.entity.Product_Order;
import com.example.assignment2.entity.Product_Order_ID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_OrderRepository extends JpaRepository<Product_Order, Product_Order_ID> {
}

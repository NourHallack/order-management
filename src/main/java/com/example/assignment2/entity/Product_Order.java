package com.example.assignment2.entity;

import javax.persistence.* ;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "product_order")
public class Product_Order {

    @EmbeddedId
     private Product_Order_ID id ;

    @ManyToOne
    @JoinColumn(name = "orderId",referencedColumnName = "id",insertable =  false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "productId",referencedColumnName = "id",insertable =  false, updatable = false)
    private Order order;

    @Column
    @NotNull
    private int quantity;

    @Column(precision=10, scale=2, columnDefinition = "DECIMAL")
    @NotNull
    private double price ;

    @Column(precision=10, scale=2, columnDefinition = "DECIMAL")
    @NotNull
    private double vat ;
}


package com.example.assignment2.service.Impl;

import com.example.assignment2.dto.Product_OrderDto;
import com.example.assignment2.entity.Product_Order;
import com.example.assignment2.entity.Product_Order_ID;
import com.example.assignment2.exception.ResourceNotFoundException;
import com.example.assignment2.repository.Product_OrderRepository;
import com.example.assignment2.service.product_orderService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service //To enable this class for component scanning
public class Product_OrderServiceImpl implements product_orderService {

    private Product_OrderRepository ProductOrderRepository;
    private ModelMapper mapper;
    public Product_OrderServiceImpl(Product_OrderRepository ProductOrderRepository, ModelMapper mapper) {
        this.ProductOrderRepository = ProductOrderRepository;
        this.mapper=mapper;
    }

    @Override
    public Product_OrderDto createProductOrder(Product_OrderDto ProductOrderDto) {
        try {


            // convert DTO to entity
            Product_Order ProductOrder = mapToEntity(ProductOrderDto);
            Product_Order newProductOrder = ProductOrderRepository.save(ProductOrder);

            // convert entity to DTO
            Product_OrderDto ProductOrderResponse = mapToDTO(newProductOrder);
            return ProductOrderResponse;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Product_OrderDto> getAllProductOrders() {
        try {
            List<Product_Order> categories = ProductOrderRepository.findAll();
            return categories.stream().map(ProductOrder -> mapToDTO(ProductOrder)).collect(Collectors.toList());
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Product_OrderDto getProductOrderById(Product_Order_ID id) {
        try {
            Product_Order ProductOrder = ProductOrderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ProductOrder", "id", id));
            return mapToDTO(ProductOrder);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Product_OrderDto updateProductOrder(Product_OrderDto ProductOrderDto, Product_Order_ID id) {
        try {
            // get ProductOrder by id from the database
            Product_Order ProductOrder = ProductOrderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ProductOrder", "id", id));
            ProductOrder.setId(ProductOrderDto.getId());
            ProductOrder.setQuantity(ProductOrderDto.getQuantity());
            ProductOrder.setPrice(ProductOrderDto.getPrice());
            ProductOrder.setVat(ProductOrderDto.getVat());
            Product_Order updatedProductOrder = ProductOrderRepository.save(ProductOrder);
            return mapToDTO(updatedProductOrder);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void deleteProductOrderById(Product_Order_ID id) {
        try {
            // get ProductOrder by id from the database
            Product_Order ProductOrder = ProductOrderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ProductOrder", "id", id));
            ProductOrderRepository.delete(ProductOrder);
        } catch (Exception e) {
            throw e;
        }
    }

    // convert Entity into DTO
    private Product_OrderDto mapToDTO(Product_Order ProductOrder) {
        try {

            Product_OrderDto ProductOrderDto = mapper.map(ProductOrder, Product_OrderDto.class);

            return ProductOrderDto;
        } catch (Exception e) {
            throw e;
        }
    }

    // convert DTO to entity
    private Product_Order mapToEntity(Product_OrderDto ProductOrderDto) {
        try {
            Product_Order ProductOrder = mapper.map(ProductOrderDto, Product_Order.class);

            return ProductOrder;
        } catch (Exception e) {
            throw e;
        }
    }
}

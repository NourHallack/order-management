package com.example.assignment2.service;

import com.example.assignment2.dto.ProductDto;

import java.util.List;

public interface productService {
    ProductDto createProduct(ProductDto ProductDto);

    List<ProductDto> getAllProducts();

    ProductDto getProductById(int id);

    ProductDto updateProduct(ProductDto ProductDto, int id);

    void deleteProductById(int id);
}

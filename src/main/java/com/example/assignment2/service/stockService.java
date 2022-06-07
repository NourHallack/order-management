package com.example.assignment2.service;

import com.example.assignment2.dto.StockDto;

import java.util.List;

public interface stockService {

    StockDto createStock(StockDto StockDto);

    List<StockDto> getAllStocks();

    StockDto getStockById(int id);

    StockDto updateStock(StockDto StockDto, int id);

    void deleteStockById(int id);
}

package com.example.assignment2.service;

import com.example.assignment2.dto.CustomerDto;

import java.util.List;

public interface customerService {

    CustomerDto createCustomer(CustomerDto CustomerDto);

    List<CustomerDto> getAllCustomers();

    CustomerDto getCustomerById(int id);

    CustomerDto updateCustomer(CustomerDto CustomerDto, int id);

    void deleteCustomerById(int id);
}

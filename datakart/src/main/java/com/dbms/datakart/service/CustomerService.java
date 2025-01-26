package com.dbms.datakart.service;

import com.dbms.datakart.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerById(Long customerId);
    CustomerDTO createCustomer(CustomerDTO customerDto);
    void deleteCustomer(Long customerId);
    CustomerDTO updateCustomer(CustomerDTO customer);
}

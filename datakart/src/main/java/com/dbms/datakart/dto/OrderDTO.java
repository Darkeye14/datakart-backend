package com.dbms.datakart.dto;

import com.dbms.datakart.entity.Customer;
import com.dbms.datakart.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
public class OrderDTO {
    private int orderId;
    private Date orderDate;
    private Customer customer;
    private Set<Long> productId;
}
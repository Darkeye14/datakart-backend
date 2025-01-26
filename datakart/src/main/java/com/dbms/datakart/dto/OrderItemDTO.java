package com.dbms.datakart.dto;

import com.dbms.datakart.entity.Order;
import com.dbms.datakart.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderItemDTO {
    private int orderItemId;
    private Order order;
    private Product product;
    private Integer quantity;
    private int price;
}

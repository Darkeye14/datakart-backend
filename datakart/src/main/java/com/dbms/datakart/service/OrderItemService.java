package com.dbms.datakart.service;

import com.dbms.datakart.dto.OrderItemDTO;

import java.util.List;

public interface OrderItemService {
    List<OrderItemDTO> getAllOrderItems();
    OrderItemDTO getOrderItemById(Long orderItemId);
    OrderItemDTO createOrderItem(OrderItemDTO orderItem);
    void deleteOrderItem(Long orderItemId);
    OrderItemDTO updateOrderItem(OrderItemDTO orderItem);
}

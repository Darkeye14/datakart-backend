package com.dbms.datakart.service;

import com.dbms.datakart.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getAllOrders();
    OrderDTO getOrderById(Long orderId);
    OrderDTO createOrder(OrderDTO order);
    void deleteOrder(Long orderId);
    OrderDTO updateOrder(OrderDTO order);
}

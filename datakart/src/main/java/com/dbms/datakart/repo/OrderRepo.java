package com.dbms.datakart.repo;

import com.dbms.datakart.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}

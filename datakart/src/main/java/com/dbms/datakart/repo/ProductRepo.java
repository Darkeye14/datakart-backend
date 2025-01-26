package com.dbms.datakart.repo;

import com.dbms.datakart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}

package com.dbms.datakart.dto;

import com.dbms.datakart.entity.Category;
import com.dbms.datakart.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class ProductDTO {
    private Long productId;
    private String productName;
    private String productDescription;
    private int productPrice;
    private Category category;
    private Set<Long> orderId;
}

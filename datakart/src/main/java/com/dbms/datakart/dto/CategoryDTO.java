package com.dbms.datakart.dto;

import com.dbms.datakart.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CategoryDTO {
    private Long categoryId;
    private String categoryName;
    private List<Long> productsId;
}

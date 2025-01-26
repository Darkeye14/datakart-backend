package com.dbms.datakart.service;

import com.dbms.datakart.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    ProductDTO getProductById(Long productId);
    ProductDTO createProduct(ProductDTO product);
    void deleteProduct(Long productId);
    ProductDTO updateProduct(ProductDTO product);
}

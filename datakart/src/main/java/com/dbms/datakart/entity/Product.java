package com.dbms.datakart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productCategory;
    private int productStock;
}

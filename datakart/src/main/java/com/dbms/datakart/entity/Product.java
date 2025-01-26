package com.dbms.datakart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @Column(name="product_name", nullable = false)
    private String productName;
    @Column(name="product_description")
    private String productDescription;

    @Column(name="product_price", nullable = false)
    private double productPrice;

    @Column(name="product_category")
    private int productCategory;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToMany(mappedBy = "products")
    private Set<Order> orders;
}

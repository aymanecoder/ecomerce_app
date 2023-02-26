package com.example.ecomerce_app.entities;

import com.example.ecomerce_app.enume.ProductStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Entity @NoArgsConstructor @AllArgsConstructor @Data @Builder
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private BigInteger merchant_id;
    private int price;
    private ProductStatus status;
    private Date created_at;
}

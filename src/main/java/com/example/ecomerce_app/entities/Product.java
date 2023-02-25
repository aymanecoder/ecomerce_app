package com.example.ecomerce_app.entities;

import java.math.BigInteger;
import java.sql.Timestamp;

public class Product {
    private BigInteger id;
    private String name;
    private BigInteger merchant_id;
    private int price;
    private ProductStatus productStatus;
    private Timestamp created_at;
}

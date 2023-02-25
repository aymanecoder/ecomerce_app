package com.example.ecomerce_app.entities;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

public class OrderItems {
    private long order_id;
    @OneToMany(fetch = FetchType.LAZY)
    private long product_id;
    private int auqntity;
}

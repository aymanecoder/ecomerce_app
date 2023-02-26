package com.example.ecomerce_app.entities;

import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

public class OrderItems {
    private Long order_id;
    @OneToMany(fetch = FetchType.LAZY)
    private Long product_id;
    private int auqntity;
}

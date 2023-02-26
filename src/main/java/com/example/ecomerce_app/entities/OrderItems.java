package com.example.ecomerce_app.entities;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class OrderItems {
    private Long orderItemId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId" ,referencedColumnName = "productId")

    private Product product_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId" ,referencedColumnName = "orderId")
    private Order order_id;
    private int quantity;
}

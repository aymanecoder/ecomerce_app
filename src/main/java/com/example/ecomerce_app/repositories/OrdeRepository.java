package com.example.ecomerce_app.repositories;

import com.example.ecomerce_app.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdeRepository extends JpaRepository<Order, Long> {
}

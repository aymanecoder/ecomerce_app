package com.example.ecomerce_app.repositories;

import com.example.ecomerce_app.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

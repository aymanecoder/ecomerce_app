package com.example.ecomerce_app.repositories;

import com.example.ecomerce_app.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepositorry extends JpaRepository<Country, Long> {
}

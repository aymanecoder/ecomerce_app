package com.example.ecomerce_app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long userId;
private String fullName;
private Date createdAt;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "countryId", referencedColumnName = "countryId")
private Country country_code;


}

package com.example.jdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jdbc.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}

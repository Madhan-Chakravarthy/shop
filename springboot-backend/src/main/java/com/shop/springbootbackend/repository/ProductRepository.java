package com.shop.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.springbootbackend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{


}



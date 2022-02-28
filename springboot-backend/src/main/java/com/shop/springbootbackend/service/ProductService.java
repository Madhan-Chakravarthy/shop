package com.shop.springbootbackend.service;

import java.util.List;

import com.shop.springbootbackend.model.Product;

public interface ProductService {
	
	Product saveProduct(Product product);
	List<Product> getAllProducts();

}

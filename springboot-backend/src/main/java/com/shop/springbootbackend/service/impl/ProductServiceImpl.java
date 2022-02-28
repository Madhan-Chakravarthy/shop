package com.shop.springbootbackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shop.springbootbackend.model.Product;
import com.shop.springbootbackend.repository.ProductRepository;
import com.shop.springbootbackend.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}


	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}


	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}

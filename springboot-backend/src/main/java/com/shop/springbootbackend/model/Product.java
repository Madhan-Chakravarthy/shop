package com.shop.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "products")
public class Product {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private long ProductId;
	
	@Column (name = "product_name" , nullable =false)
	private String productNm;
	
	public long getProductId() {
		return ProductId;
	}

	public String getProductNm() {
		return productNm;
	}

	public String getProductType() {
		return productType;
	}

	public long getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public double getRating() {
		return rating;
	}

	public String getSellerId() {
		return sellerId;
	}

	@Column (name = "product_type")
	private String productType;
	
	@Column (name = "price")
	private long price;
	
	@Column (name = "product_description")
	private String description;
	
	@Column (name = "product_rating")
	private double rating;
	
	@Column (name = "seller_id")
	private String sellerId;

}

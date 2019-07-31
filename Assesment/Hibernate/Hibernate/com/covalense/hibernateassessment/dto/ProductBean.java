package com.covalense.hibernateassessment.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class ProductBean {
	@Id
	@Column(name = "productId")
	private int productId;
	@Column(name = "productName")
	private String productName;
	@Column(name = "price")
	private double price;
	@Column(name = "color")
	private String color;
	@Column(name = "weight")
	private double weight;

}
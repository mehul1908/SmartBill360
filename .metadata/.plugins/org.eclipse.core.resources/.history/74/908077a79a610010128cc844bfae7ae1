package com.smartbill360.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="product_name" , nullable=false , unique=true)
	private String name;
	
	@Column(name="hsn_code" , nullable=false)
	private int hsnCode;
	
	@ManyToOne
	@JoinColumn(name="tax_slab" , nullable=false)
	private TaxDetail taxSlab;
	
	
	private Float rate;


	public Product(String name, int hsnCode, TaxDetail taxSlab, Float rate) {
		super();
		this.name = name;
		this.hsnCode = hsnCode;
		this.taxSlab = taxSlab;
		this.rate = rate;
	}
	
	
	
}

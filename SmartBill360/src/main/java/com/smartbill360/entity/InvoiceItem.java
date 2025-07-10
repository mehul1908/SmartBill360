package com.smartbill360.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InvoiceItem {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String invoiceItemId;
	
	@ManyToOne
	private Invoice invoice;
	
	@ManyToOne
	private Product product;
	
	private Integer quantity;
	
	private Float rate;
	
	private Float amt;
	
	private Float tax;
	
	private Float discInPer;

	public InvoiceItem(String invoiceItemId, Invoice invoice, Product product, Integer quantity, Float rate,
			Float discInPer) {
		super();
		this.invoiceItemId = invoiceItemId;
		this.invoice = invoice;
		this.product = product;
		this.quantity = quantity;
		this.rate = rate;
		this.discInPer = discInPer;
		
		Float temp = rate*quantity;
		
		this.tax = temp*discInPer/100;
		
		this.amt = temp + this.tax;
	}
	
	
}

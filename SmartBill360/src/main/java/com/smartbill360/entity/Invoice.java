package com.smartbill360.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Invoice {

	@Id
	private String invoiceNo;
	
	@ManyToOne
	private Consignee consignee;
	
	private User consignor;
	
	@CreationTimestamp
	private LocalDate date;
	
	@Column(name = "total_amt" , nullable = false)
	private Float totalAmt;
	
	@Column(name = "tax_amt" , nullable = false)
	private Float taxAmt;
	
	private User accountant;

	public Invoice(String invoiceNo, Consignee consignee, User consignor , Float totalAmt, Float taxAmt , User accountant) {
		super();
		this.invoiceNo = invoiceNo;
		this.consignee = consignee;
		this.consignor = consignor;
		this.totalAmt = totalAmt;
		this.taxAmt = taxAmt;
		this.accountant = accountant;
	}
	
	
}

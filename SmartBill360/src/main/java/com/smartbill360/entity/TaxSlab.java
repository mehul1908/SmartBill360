package com.smartbill360.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class TaxSlab {
	
	@Id
	private Float slab;
	
	private Float cgst;
	
	private Float sgst;
	
	@Column(name="cess" , columnDefinition = "DECIMAL(10,2) DEFAULT 0")
	private Float cess;
	
	
}

package com.smartbill360.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaxSlabRegModel {

	@NotNull(message="slab cannot be null")
	private Float slab;
	
	@NotNull(message="CGST cannot be null")
	private Float cgst;
	
	@NotNull(message="SGST cannot be null")
	private Float sgst;
	
	private Float cess;
}

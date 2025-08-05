package com.smartbill360.modules.tax.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaxSlabRegModel {

	@NotNull(message="slab cannot be null")
	private BigDecimal slab;
	
	@NotNull(message="CGST cannot be null")
	private BigDecimal cgst;
	
	@NotNull(message="SGST cannot be null")
	private BigDecimal sgst;
	
	private BigDecimal cess;
}

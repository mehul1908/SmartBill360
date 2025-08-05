package com.smartbill360.modules.tax.entity;

import java.math.BigDecimal;

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
    @Column(precision = 5, scale = 2) // slab like 5.00, 12.00
    private BigDecimal slab;

    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal cgst;

    @Column(precision = 5, scale = 2, nullable = false)
    private BigDecimal sgst;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal cess = BigDecimal.ZERO;
    
    private Boolean isActive;

    // Optional constructor without cess
    public TaxSlab(BigDecimal slab, BigDecimal cgst, BigDecimal sgst) {
        this.slab = slab;
        this.cgst = cgst;
        this.sgst = sgst;
        this.cess = BigDecimal.ZERO;
        this.isActive = true;
    }

	public TaxSlab(BigDecimal slab, BigDecimal cgst, BigDecimal sgst, BigDecimal cess) {
		this.slab = slab;
        this.cgst = cgst;
        this.sgst = sgst;
        this.cess = cess;
        this.isActive = true;
	}
}

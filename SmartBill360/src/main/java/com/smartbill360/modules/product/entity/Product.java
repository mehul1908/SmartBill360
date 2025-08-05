package com.smartbill360.modules.product.entity;

import java.math.BigDecimal;

import com.smartbill360.modules.tax.entity.TaxSlab;

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

    @Column(name = "product_name", nullable = false, unique = true)
    private String name;

    @Column(name = "hsn_code", nullable = false, length = 8)
    private String hsnCode;

    @ManyToOne
    @JoinColumn(name = "tax_slab", nullable = false)
    private TaxSlab taxSlab;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal rate;

    private Boolean isActive;

    public Product(String name, String hsnCode, TaxSlab taxSlab, BigDecimal rate) {
        this.name = (name != null) ? name.toUpperCase() : null;
        this.hsnCode = hsnCode;
        this.taxSlab = taxSlab;
        this.rate = rate;
        this.isActive = true;
    }
}

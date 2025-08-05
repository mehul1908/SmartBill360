package com.smartbill360.modules.tax.service;

import java.math.BigDecimal;
import java.util.List;

import com.smartbill360.modules.tax.dto.TaxSlabRegModel;
import com.smartbill360.modules.tax.entity.TaxSlab;
import com.smartbill360.modules.tax.exception.TaxSlabAlreadyCreatedException;
import com.smartbill360.modules.tax.exception.TaxSlabNotFoundException;

import jakarta.validation.Valid;

public interface TaxService {

	TaxSlab createTaxSlab(@Valid TaxSlabRegModel model) throws TaxSlabAlreadyCreatedException;

	TaxSlab removeTaxSlab(BigDecimal id) throws TaxSlabNotFoundException;

	List<TaxSlab> getAll();

	TaxSlab getTaxSlabById(BigDecimal slab);

	
}

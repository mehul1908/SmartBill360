package com.smartbill360.modules.tax.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartbill360.modules.tax.dto.TaxSlabRegModel;
import com.smartbill360.modules.tax.entity.TaxSlab;
import com.smartbill360.modules.tax.exception.TaxSlabAlreadyCreatedException;
import com.smartbill360.modules.tax.exception.TaxSlabNotFoundException;
import com.smartbill360.modules.tax.repo.TaxSlabRepo;

import jakarta.validation.Valid;

@Service
public class TaxServiceImpl implements TaxService {

	@Autowired
	private TaxSlabRepo taxSlabRepo;
	
	@Override
	public TaxSlab createTaxSlab(@Valid TaxSlabRegModel model) throws TaxSlabAlreadyCreatedException {
		Optional<TaxSlab> taxSlabOp = taxSlabRepo.findById(model.getSlab());

		if (taxSlabOp.isEmpty()) {
			TaxSlab taxSlab = new TaxSlab(model.getSlab(), model.getCgst(), model.getSgst(), model.getCess());
			taxSlabRepo.save(taxSlab);
			return taxSlab;
		} else {
			String message = "Tax Slab " + model.getSlab() + " is already created";
			throw new TaxSlabAlreadyCreatedException(message);
		}
	}

	@Override
	public TaxSlab removeTaxSlab(BigDecimal id) throws TaxSlabNotFoundException {
			TaxSlab tax = this.getTaxSlabById(id, true);

			if (tax == null) {
				throw new TaxSlabNotFoundException();
			}
			
			tax.setIsActive(false);
			taxSlabRepo.save(tax);
			return tax;
		}

	public TaxSlab getTaxSlabById(BigDecimal id, boolean b) {
		Optional<TaxSlab> taxOp = taxSlabRepo.findBySlabAndIsActive(id , b);
		if(taxOp.isEmpty())
			return null;
		else
			return taxOp.get();
	
	}

	@Override
	public List<TaxSlab> getAll() {
		return taxSlabRepo.findAll();
	}

	@Override
	public TaxSlab getTaxSlabById(BigDecimal slab) {
		Optional<TaxSlab> taxOp = taxSlabRepo.findById(slab);
		if(taxOp.isEmpty())
			return null;
		else
			return taxOp.get();
	}

}

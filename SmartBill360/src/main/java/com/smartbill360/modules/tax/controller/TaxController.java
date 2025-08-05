package com.smartbill360.modules.tax.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartbill360.dto.response.ApiResponse;
import com.smartbill360.modules.tax.dto.TaxSlabRegModel;
import com.smartbill360.modules.tax.entity.TaxSlab;
import com.smartbill360.modules.tax.exception.TaxSlabAlreadyCreatedException;
import com.smartbill360.modules.tax.exception.TaxSlabNotFoundException;
import com.smartbill360.modules.tax.service.TaxService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TaxController {

	@Autowired
	private TaxService taxService;

	// create a tax slab
	@PreAuthorize("hasRole('ACCOUNTANT')")
	@PostMapping("/create/tax-slab")
	public ResponseEntity<ApiResponse> createTaxSlab(@RequestBody @Valid TaxSlabRegModel model)
			throws TaxSlabAlreadyCreatedException {

		TaxSlab taxSlab = taxService.createTaxSlab(model);

		if (taxSlab != null) {
			log.info("Tax slab is created");
			return ResponseEntity.ok(new ApiResponse(true, null, "Tax Slab is created successfully"));
		} else {
			log.warn("Tax Slab is not created");
			return ResponseEntity.badRequest().body(new ApiResponse(false, null, "Tax Slab can not be created"));
		}
	}
	
	//delete a tax slab
	@PreAuthorize("hasRole('ACCOUNTANT')")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ApiResponse> deleteTaxSlab(@PathVariable BigDecimal id) throws TaxSlabNotFoundException{
		TaxSlab tax = taxService.removeTaxSlab(id);
		if(tax == null)
			return ResponseEntity.badRequest().body(new ApiResponse(false, null, "Updation of Product is not carried out"));
		else
			return ResponseEntity.ok(new ApiResponse(true , null , "Updation completed"));
	
	}
	
	//get a list of tax slab
	@PreAuthorize("hasRole('ACCOUNTANT')")
	@GetMapping("/get")
	public ResponseEntity<ApiResponse>  getAllTaxSlab(){
		List<TaxSlab> taxs = taxService.getAll();
		return ResponseEntity.ok(new ApiResponse(true, taxs, "Retrieved Tax Slabs"));
	}
	
	//get a tax slab with the given slab
	@PreAuthorize("hasRole('ACCOUNTANT')")
	@GetMapping("/get/{slab}")
	public ResponseEntity<ApiResponse> getTaxSlabById(@PathVariable BigDecimal slab){
		TaxSlab tax = taxService.getTaxSlabById(slab);
		if(tax==null)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(false, null, "Tax Slab not found"));
		else
			return ResponseEntity.ok(new ApiResponse(true, tax, "Retrieved Tax Slab"));
	}

}

package com.smartbill360.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartbill360.entity.Product;
import com.smartbill360.entity.TaxSlab;
import com.smartbill360.exception.ProductAlreadyCreatedException;
import com.smartbill360.exception.ProductNotFoundException;
import com.smartbill360.exception.TaxSlabAlreadyCreatedException;
import com.smartbill360.model.ProductRegModel;
import com.smartbill360.model.TaxSlabRegModel;
import com.smartbill360.model.UpdateProductModel;
import com.smartbill360.repo.ProductRepo;
import com.smartbill360.repo.TaxSlabRepo;

import jakarta.validation.Valid;

@Service
public class ProductService {

	@Autowired
	private TaxSlabRepo taxSlabRepo;

	@Autowired
	private ProductRepo prodRepo;

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

	public Product createProduct(@Valid ProductRegModel model) throws ProductAlreadyCreatedException {

		Optional<Product> prodOp = prodRepo.findByNameIgnoreCase(model.getName());
		if (prodOp.isEmpty()) {
			Product prod = new Product(model.getName(), model.getHsnCode(), model.getTaxSlab(), model.getRate());
			prodRepo.save(prod);
			return prod;
		} else {
			String message = "Product with name " + model.getName() + " is already created";
			throw new ProductAlreadyCreatedException(message);
		}

	}

	public List<Product> getAllProduct() {

		List<Product> prods = prodRepo.findAll();
		return prods;
	}

	public Product getProductById(Integer id) {
		Optional<Product> prodOp = prodRepo.findById(id);
		if (prodOp.isEmpty())
			return null;

		return prodOp.get();
	}

	public Product getProductById(Integer id, Boolean isActive) {
		Optional<Product> prodOp = prodRepo.findByIdAndIsActive(id, isActive);
		if (prodOp.isEmpty())
			return null;

		return prodOp.get();
	}

	public List<Product> getProductByName(String name) {
		List<Product> prods = prodRepo.findByNameContainingIgnoreCase(name);
		return prods;
	}

	public Product updateProduct(Integer productId, @Valid UpdateProductModel model) throws ProductNotFoundException {
		Product prod = this.getProductById(productId, true);

		if (prod == null) {
			throw new ProductNotFoundException();
		}

		if (model.getHsnCode() != null)
			prod.setHsnCode(model.getHsnCode());
		if (model.getName() != null)
			prod.setName(model.getName());
		if (model.getRate() != null)
			prod.setRate(model.getRate());
		if (model.getTaxSlab() != null)
			prod.setTaxSlab(model.getTaxSlab());
		prodRepo.save(prod);
		return prod;
	}

	public Product removeProduct(Integer productId) throws ProductNotFoundException {
		Product prod = this.getProductById(productId, true);

		if (prod == null) {
			throw new ProductNotFoundException();
		}
		
		prod.setIsActive(false);
		prodRepo.save(prod);
		return prod;
	}

}

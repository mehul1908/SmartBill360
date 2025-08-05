package com.smartbill360.modules.product.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartbill360.modules.product.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	Optional<Product> findByNameIgnoreCase(String name);

	List<Product> findByNameContainingIgnoreCase(String name);

	Optional<Product> findByIdAndIsActive(Integer id, Boolean isActive);

}

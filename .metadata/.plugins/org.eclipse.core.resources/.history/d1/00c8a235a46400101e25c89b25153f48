package com.smartbill360.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartbill360.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

	Optional<Product> findByNameIgnoreCase(String name);

}

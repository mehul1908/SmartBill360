package com.smartbill360.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartbill360.entity.InvoiceItem;

@Repository
public interface InvoiceItemRepo extends JpaRepository<InvoiceItem, String>{

}

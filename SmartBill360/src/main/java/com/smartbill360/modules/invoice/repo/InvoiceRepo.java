package com.smartbill360.modules.invoice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartbill360.modules.invoice.entity.Invoice;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice, Integer>{

	Optional<Invoice> findByInvoiceNoAndIsActive(Integer invoiceId, boolean isActive);

}

package com.smartbill360.modules.invoice.service;

import java.util.List;

import com.smartbill360.modules.invoice.dto.InvoiceRegModel;
import com.smartbill360.modules.invoice.entity.Invoice;
import com.smartbill360.modules.invoice.entity.InvoiceItem;
import com.smartbill360.modules.invoice.exception.InvoiceNotFoundException;

import jakarta.validation.Valid;

public interface InvoiceService {

    /**
     * Creates a new invoice and returns the generated PDF.
     */
    byte[] createInvoice(@Valid InvoiceRegModel model);

    /**
     * Updates an existing invoice.
     * @throws InvoiceNotFoundException if invoice does not exist
     */
    Invoice updateInvoice(Integer invoiceId, @Valid InvoiceRegModel model) throws InvoiceNotFoundException;

    /**
     * Soft deletes (deactivates) an invoice.
     * @throws InvoiceNotFoundException if invoice does not exist
     */
    Invoice deactivateInvoice(Integer invoiceId) throws InvoiceNotFoundException;

    /**
     * Retrieves invoice by ID.
     * @throws InvoiceNotFoundException if invoice is not found
     */
    Invoice getInvoiceById(Integer invoiceId) throws InvoiceNotFoundException;

    /**
     * Overloaded method: retrieves invoice by ID with optional active check.
     * @param includeInactive - if true, fetches even if deactivated
     */
    Invoice getInvoiceById(Integer invoiceId, boolean includeInactive) throws InvoiceNotFoundException;

    /**
     * Checks if the currently authenticated user is allowed to access the invoice.
     */
    boolean isUserRelatedToInvoice(Invoice invoice);

    /**
     * Returns the list of items in the invoice.
     */
    List<InvoiceItem> getProductItemByInvoice(Invoice invoice);
}

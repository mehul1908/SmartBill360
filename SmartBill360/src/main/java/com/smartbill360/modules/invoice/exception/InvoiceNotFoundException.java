package com.smartbill360.modules.invoice.exception;

public class InvoiceNotFoundException extends Exception {

	private static final long serialVersionUID = -6611044919122772259L;
	
	public InvoiceNotFoundException() {
		super("Invoice not found");
	}

}

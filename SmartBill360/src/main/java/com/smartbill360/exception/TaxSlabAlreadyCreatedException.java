package com.smartbill360.exception;

public class TaxSlabAlreadyCreatedException extends Exception{

	private static final long serialVersionUID = -2900041140244138082L;
	
	public TaxSlabAlreadyCreatedException(String message) {
		super(message);
	}

}

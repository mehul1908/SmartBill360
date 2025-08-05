package com.smartbill360.modules.product.exception;

public class ProductAlreadyCreatedException extends Exception{

	private static final long serialVersionUID = -2900041140244138082L;
	
	public ProductAlreadyCreatedException(String message) {
		super(message);
	}

}

package com.smartbill360.exception;

public class UserAlreadyCreatedException extends Exception{

	private static final long serialVersionUID = -2900041140244138082L;
	
	public UserAlreadyCreatedException(String message) {
		super(message);
	}

}

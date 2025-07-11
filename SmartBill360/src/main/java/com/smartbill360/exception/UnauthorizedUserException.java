package com.smartbill360.exception;

public class UnauthorizedUserException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -723162869578730357L;

	public UnauthorizedUserException(String message) {
        super(message);
    }
}

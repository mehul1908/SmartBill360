package com.smartbill360.exception;

public class EmailAndPasswordNotMatchException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6444856449804033642L;

	public EmailAndPasswordNotMatchException() {
        super("Username and Password doesn't match");
    }
}

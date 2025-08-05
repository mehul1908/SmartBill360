package com.smartbill360.modules.user.exception;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = -6611044919122772259L;
	
	public UserNotFoundException() {
		super("User not found");
	}

	public UserNotFoundException(String string) {
		super(string);
	}

}

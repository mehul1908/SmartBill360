package com.smartbill360.exception;

public class GSTAlreadyExistedException extends Exception {

	private static final long serialVersionUID = -6611044919122772259L;
	
	public GSTAlreadyExistedException(String gst) {
		super("Client with GST Number " + gst + " already existed");
	}

}

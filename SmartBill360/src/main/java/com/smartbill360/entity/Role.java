package com.smartbill360.entity;

public enum Role {
	ROLE_ADMIN("admin") ,
	ROLE_ACCOUNTANT("accountant") ,
	ROLE_CLIENT("client");

	private final String label;

    Role(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
    public Boolean isEqual(String label) {
    	return this.getLabel().equals(label);
    }

}

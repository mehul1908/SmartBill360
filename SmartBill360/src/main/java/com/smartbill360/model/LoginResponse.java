package com.smartbill360.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

	private String token;
	
	private String email;
	
	private String name;
	
}

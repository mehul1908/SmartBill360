package com.smartbill360.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginModel {

	@Email(message="Email is not in proper format")
	private String email;
	
	@NotBlank(message="Password cann't be blank")
	private String password;
}

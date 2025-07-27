package com.smartbill360.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ForgetPasswordModel {

	@NotBlank(message="Old Password can't be blank")
	private String oldPassword;
	
	@NotBlank(message = "New password can't be blank")
	private String newPassword;
}

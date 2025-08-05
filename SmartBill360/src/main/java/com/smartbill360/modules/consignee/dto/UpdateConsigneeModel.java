package com.smartbill360.modules.consignee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateConsigneeModel {

	private String gstin;
	
	private String name;
	
	private Integer stateCode;
	
	private String email;
	
	private String contact;
	
	private String address;
	
	private Boolean isRegular;
	
}

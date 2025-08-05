package com.smartbill360.modules.invoice.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceRegModel {

	
	@NotNull(message = "Consignee can not be null")
	private Integer consigneeId;
	
	@NotBlank(message = "Consignor can not be blank")
	@Email(message = "Consignor Email is not in proper format.")
	private String consignorEmail;
	
	@NotNull(message = "Product List can not be null")
	private List<InvoiceItemRegModel> products;
}

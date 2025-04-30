package com.axitiy.infrastructure.adapters.input.rest.data.request;

import jakarta.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    
	@NotEmpty(message = "Product Code may not be empty")
	private String pcodprax;

	@NotEmpty(message = "Product may not be empty")
    private String pnomprax;

}

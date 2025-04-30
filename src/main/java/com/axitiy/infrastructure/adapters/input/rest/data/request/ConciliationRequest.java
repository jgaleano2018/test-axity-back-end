package com.axitiy.infrastructure.adapters.input.rest.data.request;

import java.util.Date;

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
public class ConciliationRequest {
    
	@NotEmpty(message = "Conciliation Date may not be empty")
    private Date afearax;

	@NotEmpty(message = "Branch may not be empty")
    private int asidsucax;
    
	@NotEmpty(message = "Product may not be empty")
    private int apidprax;
    
	@NotEmpty(message = "Document may not be empty")
    private int adiddoax;
    
	@NotEmpty(message = "Increment Percentage may not be empty")
    private double adifax;
    
	@NotEmpty(message = "Total may not be empty")
    private double asfarax;
    
	@NotEmpty(message = "Conciliation Type may not be empty")
    private String aresax;

}

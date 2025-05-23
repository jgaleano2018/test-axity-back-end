package com.axitiy.infrastructure.adapters.input.rest.data.request;

import jakarta.validation.constraints.NotEmpty;

public class ProductRequest {
    
	@NotEmpty(message = "Product Code may not be empty")
	private String pcodprax;

	@NotEmpty(message = "Product may not be empty")
    private String pnomprax;
	
	
	public String getPcodprax() {
        return pcodprax;
    }
    
    public void setPcodprax(String pcodprax) {
        this.pcodprax = pcodprax;
    }
    
    public String getPnomprax() {
        return pnomprax;
    }
    
    public void setPnomprax(String pnomprax) {
        this.pnomprax = pnomprax;
    }

}

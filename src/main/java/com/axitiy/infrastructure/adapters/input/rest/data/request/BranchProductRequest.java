package com.axitiy.infrastructure.adapters.input.rest.data.request;

import jakarta.validation.constraints.NotEmpty;

public class BranchProductRequest {
	
	@NotEmpty(message = "Conciliation Date may not be empty")
    private int scidsucax;

	@NotEmpty(message = "Product may not be empty")
    private int scidprax;
    
	@NotEmpty(message = "Document may not be empty")
    private int sciddoax;
    
    
    public int getScidsucax() {
        return scidsucax;
    }
    
    public void setScidsucax(int scidsucax) {
        this.scidsucax = scidsucax;
    }
    
    public int getScidprax() {
        return scidprax;
    }
    
    public void setScidprax(int scidprax) {
        this.scidprax = scidprax;
    }
    
    public int getSciddoax() {
        return sciddoax;
    }
    
    public void setSciddoax(int sciddoax) {
        this.sciddoax = sciddoax;
    }


}

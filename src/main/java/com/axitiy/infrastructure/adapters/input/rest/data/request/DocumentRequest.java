package com.axitiy.infrastructure.adapters.input.rest.data.request;

import jakarta.validation.constraints.NotEmpty;

public class DocumentRequest {
    
	@NotEmpty(message = "Document Code may not be empty")
	private String dcoddoax;

	@NotEmpty(message = "Document may not be empty")
    private String dnomdoax;
	
	
	public String getDcoddoax() {
        return dcoddoax;
    }
    
    public void setDcoddoax(String dcoddoax) {
        this.dcoddoax = dcoddoax;
    }
    
    public String getDnomdoax() {
        return dnomdoax;
    }
    
    public void setDnomdoax(String dnomdoax) {
        this.dnomdoax = dnomdoax;
    }

}

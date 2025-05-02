package com.axitiy.infrastructure.adapters.input.rest.data.request;

import jakarta.validation.constraints.NotEmpty;

public class BranchRequest {
    
	@NotEmpty(message = "Branch Code may not be empty")
	private String scodsucax;

	@NotEmpty(message = "Branch may not be empty")
    private String snomsucax;
	

    public String getScodsucax() {
        return scodsucax;
    }
    
    public void setScodsucax(String scodsucax) {
        this.scodsucax = scodsucax;
    }
    
    public String getSnomsucax() {
        return snomsucax;
    }
    
    public void setSnomsucax(String snomsucax) {
        this.snomsucax = snomsucax;
    }

}

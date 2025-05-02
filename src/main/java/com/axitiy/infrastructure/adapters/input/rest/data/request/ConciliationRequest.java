package com.axitiy.infrastructure.adapters.input.rest.data.request;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;

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
	
	
    public Date getAfearax() {
        return afearax;
    }
    
    public void setAfearax(Date afearax) {
        this.afearax = afearax;
    }

    public int getAsidsucax() {
        return asidsucax;
    }
    
    public void setAsidsucax(int asidsucax) {
        this.asidsucax = asidsucax;
    }
    
    public int getApidprax() {
        return apidprax;
    }
    
    public void setApidprax(int apidprax) {
        this.apidprax = apidprax;
    }
    
    public int getAdiddoax() {
        return adiddoax;
    }
    
    public void setAdiddoax(int adiddoax) {
        this.adiddoax = adiddoax;
    }
    
    public double getAdifax() {
        return adifax;
    }
    
    public void setAdifax(double adifax) {
        this.adifax = adifax;
    }
    
    public double getAsfarax() {
        return asfarax;
    }
    
    public void setAsfarax(double asfarax) {
        this.asfarax = asfarax;
    }
    
    
    public String getAresax() {
        return aresax;
    }
    
    public void setAresax(String aresax) {
        this.aresax = aresax;
    }


}

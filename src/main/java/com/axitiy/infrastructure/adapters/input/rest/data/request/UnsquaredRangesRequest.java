package com.axitiy.infrastructure.adapters.input.rest.data.request;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;

public class UnsquaredRangesRequest {
    
	@NotEmpty(message = "Year may not be empty")
	private String danoax;

	@NotEmpty(message = "Month may not be empty")
    private String dmesax;
    
	@NotEmpty(message = "Conciliation may not be empty")
    private String dconax;

	@NotEmpty(message = "Branch Code may not be empty")
    private int dsidsucax;

	@NotEmpty(message = "Product Code may not be empty")
    private int dpidprax;
    
	@NotEmpty(message = "Document may not be empty")
    private int ddiddoax;
    
	@NotEmpty(message = "Conciliation Date may not be empty")
    private Date dfearax;
    
	@NotEmpty(message = "Increment Percent may not be empty")
    private double ddifax;
    
	@NotEmpty(message = "Total may not be empty")
    private double dsfarax;
    
	@NotEmpty(message = "Conciliation Type may not be empty")
    private String dresax;
	
	/*public UnsquaredRangesRequest(String danoax, String dmesax, String dconax, int dsidsucax, int dpidprax, int ddiddoax, Date dfearax, Double ddifax, Double dsfarax, String dresax) {
        this.danoax = danoax;
        this.dmesax = dmesax;
        this.dconax = dconax;
        this.dsidsucax = dsidsucax;
        this.dpidprax = dpidprax;
        this.ddiddoax = ddiddoax;
        this.dfearax = dfearax;
        this.ddifax = ddifax;
        this.dsfarax = dsfarax;
        this.dresax = dresax;
    }*/

    public String getDanoax() {
        return danoax;
    }
    
    public void setDanoax(String danoax) {
        this.danoax = danoax;
    }
    
    public String getDmesax() {
        return dmesax;
    }
    
    public void setDmesax(String dmesax) {
        this.dmesax = dmesax;
    }
    
    public int getDsidsucax() {
        return dsidsucax;
    }
    
    public void setDsidsucax(int dsidsucax) {
        this.dsidsucax = dsidsucax;
    }
    
    public String getDconax() {
        return dconax;
    }
    
    public void setDconax(String dconax) {
        this.dconax = dconax;
    }
    
    public int getDpidprax() {
        return dpidprax;
    }
    
    public void setDpidprax(int dpidprax) {
        this.dpidprax = dpidprax;
    }
    
    public int getDdiddoax() {
        return ddiddoax;
    }
    
    public void setDdiddoax(int ddiddoax) {
        this.ddiddoax = ddiddoax;
    }

    public Date getDfearax() {
        return dfearax;
    }
    
    public void setDfearax(Date dfearax) {
        this.dfearax = dfearax;
    }
    
    public double getDdifax() {
        return ddifax;
    }
    
    public void setDdifax(double ddifax) {
        this.ddifax = ddifax;
    }
    
    public double getDsfarax() {
        return dsfarax;
    }
    
    public void setDsfarax(double dsfarax) {
        this.dsfarax = dsfarax;
    }
    
    public String getDresax() {
        return dresax;
    }
    
    public void setDresax(String dresax) {
        this.dresax = dresax;
    }
	    
 
}

package com.axitiy.infrastructure.adapters.output.persistence.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Builder;

//@Builder
@Entity
@Table(name = "conciliation")
public class ConciliationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int aid;

    private Date afearax;

    private int asidsucax;
    
    private int apidprax;
    
    private int adiddoax;
    
    private double adifax;
    
    private double asfarax;
    
    private String aresax;
    
    /*public ConciliationEntity(Date afearax, int asidsucax, int apidprax, int adiddoax, double adifax, double asfarax, String aresax) {
        this.afearax = afearax;
        this.asidsucax = asidsucax;
        this.apidprax = apidprax;
        this.adiddoax = adiddoax;
        this.adifax = adifax;
        this.asfarax = asfarax;
        this.aresax = aresax;
    }*/

    public int getId_Conciliation() {
        return aid;
    }
    
    public void setId_Conciliation(int aid) {
        this.aid = aid;
    }

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

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
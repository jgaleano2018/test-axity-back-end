package com.axitiy.infrastructure.adapters.output.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int pidprax;

    private String pcodprax;

    private String pnomprax;
    
    
    public ProductEntity(String pcodprax, String pnomprax) {
        this.pcodprax = pcodprax;
        this.pnomprax = pnomprax;
    }

    public int getId_Product() {
        return pidprax;
    }
    
    public void setId_Product(int pidprax) {
        this.pidprax = pidprax;
    }

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
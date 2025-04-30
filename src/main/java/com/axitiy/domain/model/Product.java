package com.axitiy.domain.model;

public class Product {

    private int pidprax;

    private String pcodprax;

    private String pnomprax;
    
    
    public Product(String pcodprax, String pnomprax) {
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
package com.axitiy.domain.model;

public class BranchProduct {

    private int scid;

    private int scidsucax;

    private int scidprax;
    
    private int sciddoax;
    
    
    public BranchProduct(int scidsucax, int scidprax, int sciddoax) {
        this.scidsucax = scidsucax;
        this.scidprax = scidprax;
        this.sciddoax = sciddoax;
    }

    public int getId_BranchProduct() {
        return scid;
    }
    
    public void setId_BranchProduct(int scid) {
        this.scid = scid;
    }

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
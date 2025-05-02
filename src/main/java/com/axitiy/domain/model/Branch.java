package com.axitiy.domain.model;

public class Branch {

    private int sidsucax;

    private String scodsucax;

    private String snomsucax;
    
    
    /*public Branch(String scodsucax, String snomsucax) {
        this.scodsucax = scodsucax;
        this.snomsucax = snomsucax;
    }*/

    public int getId_Branch() {
        return sidsucax;
    }
    
    public void setId_Branch(int sidsucax) {
        this.sidsucax = sidsucax;
    }

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
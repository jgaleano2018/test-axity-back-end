package com.axitiy.infrastructure.adapters.input.rest.data.response;

public class BranchResponse {
    
	private int sidsucax;

    private String scodsucax;

    private String snomsucax;
    
    /*public BranchResponse(int sidsucax, String scodsucax, String snomsucax) {
        this.sidsucax = sidsucax;
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
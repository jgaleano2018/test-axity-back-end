package com.axitiy.infrastructure.adapters.output.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "branch")
public class BranchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private int sidsucax;

    private String scodsucax;

    private String snomsucax;

    
    public BranchEntity(String scodsucax, String snomsucax) {
        this.scodsucax = scodsucax;
        this.snomsucax = snomsucax;
    }

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
package com.axitiy.domain.model;

import java.util.Date;

public class UnsquaredRanges {

    private int id;

    private String danoax;

    private String dmesax;
    
    private String dconax;

    private int dsidsucax;
    
    private int dpidprax;
    
    private int ddiddoax;
    
    private Date dfearax;
    
    private double ddifax;
    
    private double dsfarax;
    
    private String dresax;
    
   
    public UnsquaredRanges(String danoax, String dmesax, String dconax, int dsidsucax, int dpidprax, int ddiddoax, Date dfearax, Double ddifax, Double dsfarax, String dresax) {
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
    }

    public int getId_UnsquaredRanges() {
        return id;
    }
    
    public void setId_Conciliation(int id) {
        this.id = id;
    }

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
    
    public String getDconax() {
        return dconax;
    }
    
    public void setDconax(String dconax) {
        this.dconax = dconax;
    }
    
    public int getDsidsucax() {
        return dsidsucax;
    }
    
    public void setDsidsucax(int dsidsucax) {
        this.dsidsucax = dsidsucax;
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
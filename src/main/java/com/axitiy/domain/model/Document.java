package com.axitiy.domain.model;

public class Document {

    private int diddoax;

    private String dcoddoax;

    private String dnomdoax;
    
    
    /*public Document(String dcoddoax, String dnomdoax) {
        this.dcoddoax = dcoddoax;
        this.dnomdoax = dnomdoax;
    }*/

    public int getId_Document() {
        return diddoax;
    }
    
    public void setId_Document(int diddoax) {
        this.diddoax = diddoax;
    }

    public String getDcoddoax() {
        return dcoddoax;
    }
    
    public void setDcoddoax(String dcoddoax) {
        this.dcoddoax = dcoddoax;
    }
    
    public String getDnomdoax() {
        return dnomdoax;
    }
    
    public void setDnomdoax(String dnomdoax) {
        this.dnomdoax = dnomdoax;
    }

}
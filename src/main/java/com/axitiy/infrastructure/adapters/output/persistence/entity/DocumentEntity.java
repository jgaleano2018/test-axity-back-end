package com.axitiy.infrastructure.adapters.output.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "document")

public class DocumentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
    private int diddoax;

    private String dcoddoax;

    private String dnomdoax;
    
    
    public DocumentEntity(String dcoddoax, String dnomdoax) {
        this.dcoddoax = dcoddoax;
        this.dnomdoax = dnomdoax;
    }

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
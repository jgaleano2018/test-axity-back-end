package com.axitiy.infrastructure.adapters.output.persistence.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unsquared_ranges_report")
public class UnsquaredRangesReportEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int id;

    private String danoax;

    private String dmesax;
    
    private String dconax;

    private int dsidsucax;
    
    private String scodsucax;
    
    private String snomsucax;
    
    private int dpidprax;
    
    private String pcodprax;
    
    private String pnomprax;
    
    private int ddiddoax;
    
    private String dcoddoax;
    
    private String dnomdoax;
    
    private Date dfearax;
    
    private double ddifax;
    
    private double dsfarax;
    
    private String dresax;
    
    
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
    
    public String getDscodsucax() {
        return scodsucax;
    }
    
    public void setDscodsucax(String scodsucax) {
        this.scodsucax = scodsucax;
    }
    
    public String getDsnomsucax() {
        return snomsucax;
    }
    
    public void setDsnomsucax(String snomsucax) {
        this.snomsucax = snomsucax;
    }
    
    public int getDpidprax() {
        return dpidprax;
    }
    
    public void setDpidprax(int dpidprax) {
        this.dpidprax = dpidprax;
    }
    
    public String getDpcodprax() {
        return pcodprax;
    }
    
    public void setDpcodprax(String pcodprax) {
        this.pcodprax = pcodprax;
    }
    
    public String getDpnomprax() {
        return pnomprax;
    }
    
    public void setDpnomprax(String pnomprax) {
        this.pnomprax = pnomprax;
    }
    
    public int getDdiddoax() {
        return ddiddoax;
    }
    
    public void setDdiddoax(int ddiddoax) {
        this.ddiddoax = ddiddoax;
    }

    public String getDdcoddoax() {
        return dcoddoax;
    }
    
    public void setDdcoddoax(String dcoddoax) {
        this.dcoddoax = dcoddoax;
    }
    
    public String getDdnomdoax() {
        return dnomdoax;
    }
    
    public void setDdnomdoax(String dnomdoax) {
        this.dnomdoax = dnomdoax;
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
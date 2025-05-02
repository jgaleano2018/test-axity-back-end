package com.axitiy.domain.model;

import java.util.List;

import com.axitiy.infrastructure.adapters.input.rest.data.request.ConciliationRequest;
import com.axitiy.infrastructure.adapters.input.rest.data.request.UnsquaredRangesRequest;

public class RequestBodyConciliation {
	
    private List<ConciliationRequest> conciliationToCreate;

    private UnsquaredRangesRequest unsquaredRangesToCreate;

    private String monthConciliationRequest;
    
    private String yearConciliationRequest;
    
    
    public List<ConciliationRequest> getConciliationToCreate() {
        return conciliationToCreate;
    }
    
    public void setConciliationToCreate(List<ConciliationRequest> conciliationToCreate) {
        this.conciliationToCreate = conciliationToCreate;
    }

    
    public UnsquaredRangesRequest getUnsquaredRangesToCreate() {
        return unsquaredRangesToCreate;
    }
    
    public void setUnsquaredRangesToCreate(UnsquaredRangesRequest unsquaredRangesToCreate) {
        this.unsquaredRangesToCreate = unsquaredRangesToCreate;
    }

    
    public String getMonthConciliationRequest() {
        return monthConciliationRequest;
    }
    
    public void setMonthConciliationRequest(String monthConciliationRequest) {
        this.monthConciliationRequest = monthConciliationRequest;
    }
    
    
    public String getYearConciliationRequest() {
        return yearConciliationRequest;
    }
    
    public void setYearConciliationRequest(String yearConciliationRequest) {
        this.yearConciliationRequest = yearConciliationRequest;
    }
}
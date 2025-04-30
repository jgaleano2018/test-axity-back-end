package com.axitiy.domain.exception;

public class ConciliationNotFoundException extends RuntimeException{
    
    public ConciliationNotFoundException(String msg){
        super(msg);
    }
}
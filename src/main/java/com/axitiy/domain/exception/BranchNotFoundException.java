package com.axitiy.domain.exception;

public class BranchNotFoundException extends RuntimeException{
    
    public BranchNotFoundException(String msg){
        super(msg);
    }
}
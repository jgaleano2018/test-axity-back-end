package com.axitiy.domain.exception;

public class DocumentNotFoundException extends RuntimeException{
    
    public DocumentNotFoundException(String msg){
        super(msg);
    }
}
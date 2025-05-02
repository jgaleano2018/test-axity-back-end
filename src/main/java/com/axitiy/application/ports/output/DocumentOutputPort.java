package com.axitiy.application.ports.output;

import java.util.List;

import com.axitiy.domain.model.Document;

public interface DocumentOutputPort {
    
	List<Document> getAll();
    
}
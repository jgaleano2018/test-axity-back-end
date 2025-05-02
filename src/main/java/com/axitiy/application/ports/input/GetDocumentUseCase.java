package com.axitiy.application.ports.input;

import java.util.List;

import com.axitiy.domain.model.Document;

public interface GetDocumentUseCase {
	
	List<Document> getAll();
    
}
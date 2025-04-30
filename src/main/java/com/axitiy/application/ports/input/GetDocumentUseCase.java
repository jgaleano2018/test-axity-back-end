package com.axitiy.application.ports.input;

import com.axitiy.domain.model.Document;

public interface GetDocumentUseCase {
   
	Document getDocumentById(Long id);
    
}
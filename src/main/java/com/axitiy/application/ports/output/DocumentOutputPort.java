package com.axitiy.application.ports.output;

import java.util.Optional;

import com.axitiy.domain.model.Document;

public interface DocumentOutputPort {
    
	Document saveDocument(Document document);
    
    Optional<Document> getDocumentById(Long id);
    
}
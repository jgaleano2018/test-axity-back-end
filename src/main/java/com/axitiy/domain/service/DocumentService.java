package com.axitiy.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.axitiy.application.ports.input.GetDocumentUseCase;
import com.axitiy.application.ports.output.DocumentOutputPort;
import com.axitiy.domain.model.Document;

@Component("beanName5")
public class DocumentService implements GetDocumentUseCase{

	@Autowired
	@Qualifier("beanName6")
    DocumentOutputPort documentOutputPort;
    
	@Override
    public List<Document> getAll() {
        System.out.println("Retornando lista de Documentos");
        return documentOutputPort.getAll();
    }
    
}
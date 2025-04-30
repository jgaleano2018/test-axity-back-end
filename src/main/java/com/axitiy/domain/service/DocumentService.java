package com.axitiy.domain.service;

import com.axitiy.application.ports.input.CreateDocumentUseCase;
import com.axitiy.application.ports.input.GetDocumentUseCase;
import com.axitiy.application.ports.output.DocumentOutputPort;
import com.axitiy.domain.exception.DocumentNotFoundException;
import com.axitiy.domain.model.Document;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DocumentService implements CreateDocumentUseCase, GetDocumentUseCase{

    private final DocumentOutputPort documentOutputPort = null;
    
    @Override
    public Document getDocumentById(Long id) {
        System.out.println("Retornando Dcoumento por ID");
        return documentOutputPort.getDocumentById(id)
                                .orElseThrow(() -> new DocumentNotFoundException("No se encontro el documento con ID: " + id));
    }

    @Override
    public Document createDocument(Document document) {
        System.out.println("Creando Documento");
        return documentOutputPort.saveDocument(document);
    }
    
}
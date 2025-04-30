package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.domain.model.Document;
import com.axitiy.infrastructure.adapters.output.persistence.entity.DocumentEntity;


public class DocumentMapper {

    @Autowired
    private ModelMapper mapper;

    public Document toDocument(DocumentEntity entity){
        return mapper.map(entity, Document.class);
    }
    
    public DocumentEntity toDocument(Document document){
        return mapper.map(document, DocumentEntity.class);
    }

}
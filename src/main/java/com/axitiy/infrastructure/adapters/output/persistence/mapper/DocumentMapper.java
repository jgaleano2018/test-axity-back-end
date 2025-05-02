package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import com.axitiy.domain.model.Document;
import com.axitiy.infrastructure.adapters.output.persistence.entity.DocumentEntity;

@Component("beanName7")
public class DocumentMapper {

	private final ModelMapper mapper = new ModelMapper();

    public Document toDocument(DocumentEntity entity){
        return mapper.map(entity, Document.class);
    }
    
    public DocumentEntity toDocument(Document document){
        return mapper.map(document, DocumentEntity.class);
    }
    
    public List<DocumentEntity> toListDocumentEntity(List<Document> document){
        return mapper.map(document, new TypeToken<List<DocumentEntity>>() {}.getType());
    }
    
    public List<Document> toListDocument(List<DocumentEntity> documentEntity){
        return mapper.map(documentEntity, new TypeToken<List<Document>>() {}.getType());
    }

}
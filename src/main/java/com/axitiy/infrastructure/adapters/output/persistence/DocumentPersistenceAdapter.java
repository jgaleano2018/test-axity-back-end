package com.axitiy.infrastructure.adapters.output.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.axitiy.application.ports.output.DocumentOutputPort;
import com.axitiy.domain.model.Document;
import com.axitiy.infrastructure.adapters.output.persistence.entity.DocumentEntity;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.DocumentMapper;
import com.axitiy.infrastructure.adapters.output.persistence.repository.DocumentRepository;

import lombok.RequiredArgsConstructor;

@Component("beanName6")
@RequiredArgsConstructor
public class DocumentPersistenceAdapter implements DocumentOutputPort {

	@Autowired
	DocumentRepository documentRepository;

    private final DocumentMapper documentMapper = new DocumentMapper();
    
    public DocumentPersistenceAdapter(DocumentRepository documentRepository2,
    		DocumentMapper documentMapper2) {
		// TODO Auto-generated constructor stub
	}

    @Override
    public List<Document> getAll() {
        List<DocumentEntity> documentEntity = documentRepository.findAll();

        return documentMapper.toListDocument(documentEntity);
    }
    
}
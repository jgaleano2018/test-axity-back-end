package com.axitiy.infrastructure.adapters.input;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axitiy.application.ports.input.GetDocumentUseCase;
import com.axitiy.domain.model.Document;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.DocumentMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Document")
@RequiredArgsConstructor
public class DocumentRestAdapter {
    
	@Autowired
	@Qualifier("beanName5")
    GetDocumentUseCase getDocumentUseCase;

    private final DocumentMapper documentMapper = new DocumentMapper();
    
    @CrossOrigin(origins = "http://localhost:4200")

   
    @GetMapping(value = "/getDocument")
    public ResponseEntity<?> getDocument(){
    	List<Document> document = getDocumentUseCase.getAll();
        // Domain to response
        return new ResponseEntity<>(documentMapper.toListDocumentEntity(document), HttpStatus.OK);
    }

}

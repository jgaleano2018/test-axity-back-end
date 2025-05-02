package com.axitiy.domain.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.application.ports.input.CreateConciliationUseCase;
import com.axitiy.application.ports.input.GetConciliationUseCase;
import com.axitiy.application.ports.output.ConciliationOutputPort;
import com.axitiy.domain.exception.ConciliationNotFoundException;
import com.axitiy.domain.model.Conciliation;
import com.axitiy.infrastructure.adapters.output.persistence.ConciliationPersistenceAdapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConciliationService implements CreateConciliationUseCase, GetConciliationUseCase{
	
	@Autowired
    ConciliationOutputPort conciliationOutputPort;
    
    public ConciliationService(ConciliationPersistenceAdapter conciliationPersistenceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public Conciliation getConciliationById(Long id) {
        System.out.println("Retornando Conciliación por ID");
        return conciliationOutputPort.getConciliationById(id)
                                .orElseThrow(() -> new ConciliationNotFoundException("No se encontro la conciliación con ID: " + id));
    }

    @Override
    public Conciliation createConciliation(Conciliation conciliation) {
        System.out.println("Creando Conciliación");
        return conciliationOutputPort.saveConciliation(conciliation);
    }
    
}
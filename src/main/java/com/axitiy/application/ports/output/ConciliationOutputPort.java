package com.axitiy.application.ports.output;

import java.util.Optional;

import com.axitiy.domain.model.Conciliation;

public interface ConciliationOutputPort {
    
	Conciliation saveConciliation(Conciliation conciliation);
    
    Optional<Conciliation> getConciliationById(Long id);
    
}
package com.axitiy.application.ports.input;

import com.axitiy.domain.model.Conciliation;

public interface CreateConciliationUseCase {
   
	Conciliation createConciliation(Conciliation conciliation);
    
}
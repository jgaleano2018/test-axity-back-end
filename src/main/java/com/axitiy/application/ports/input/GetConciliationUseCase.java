package com.axitiy.application.ports.input;

import com.axitiy.domain.model.Conciliation;

public interface GetConciliationUseCase {
   
	Conciliation getConciliationById(Long id);
    
}
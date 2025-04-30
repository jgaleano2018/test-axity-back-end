package com.axitiy.application.ports.input;

import java.util.Date;
import java.util.List;

import com.axitiy.domain.model.UnsquaredRanges;

public interface GetUnsquaredRangesUseCase {
   
	UnsquaredRanges getUnsquaredRangesById(Long id);
	
	List<UnsquaredRanges> getUnsquaredRangesByFilters(Date afearax, int asidsucax, int apidprax);
    
}
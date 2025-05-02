package com.axitiy.application.ports.input;

import java.util.Date;
import java.util.List;

import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.domain.model.UnsquaredRangesReport;

public interface GetUnsquaredRangesUseCase {
   
	UnsquaredRanges getUnsquaredRangesById(Long id);
	
	List<UnsquaredRangesReport> getUnsquaredRangesByFilters(String afearax_year, String afearax_month, String afearax_day, int asidsucax, int apidprax);
    
}
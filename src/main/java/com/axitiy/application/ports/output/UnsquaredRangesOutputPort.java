
package com.axitiy.application.ports.output;

import java.util.List;
import java.util.Optional;

import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.domain.model.UnsquaredRangesReport;

public interface UnsquaredRangesOutputPort {
    
	UnsquaredRanges saveUnsquaredRanges(UnsquaredRanges unsquaredRanges);
    
    Optional<UnsquaredRanges> getUnsquaredRangesById(Long id);
    
    List<UnsquaredRangesReport> getUnsquaredRangesByFilters(String afearax_year, String afearax_month, String afearax_day, int asidsucax, int apidprax);
    
}
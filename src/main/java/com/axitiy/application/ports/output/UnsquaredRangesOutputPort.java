
package com.axitiy.application.ports.output;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.axitiy.domain.model.UnsquaredRanges;

public interface UnsquaredRangesOutputPort {
    
	UnsquaredRanges saveUnsquaredRanges(UnsquaredRanges unsquaredRanges);
    
    Optional<UnsquaredRanges> getUnsquaredRangesById(Long id);
    
    List<UnsquaredRanges> getUnsquaredRangesByFilters(Date afearax, int asidsucax, int apidprax);
    
}
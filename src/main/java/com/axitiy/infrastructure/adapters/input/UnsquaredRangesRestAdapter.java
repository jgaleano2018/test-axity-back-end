
package com.axitiy.infrastructure.adapters.input;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axitiy.application.ports.input.GetUnsquaredRangesUseCase;
import com.axitiy.domain.model.UnsquaredRangesReport;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.UnsquaredRangesMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/UnsquaredRanges")
@RequiredArgsConstructor
public class UnsquaredRangesRestAdapter {
    
	@Autowired
    GetUnsquaredRangesUseCase getUnsquaredRangesUseCase;

    private final UnsquaredRangesMapper unsquaredRangesMapper = new UnsquaredRangesMapper();
    
    @CrossOrigin(origins = "http://localhost:4200")
    
    @GetMapping(value = "/getUnsquaredRanges/{afearax_year}/{afearax_month}/{afearax_day}/{asidsucax}/{apidprax}")
    public ResponseEntity<?> getUnsquaredRanges(@PathVariable(name = "afearax_year") String afearax_year,
    		@PathVariable(name = "afearax_month") String afearax_month,
    		@PathVariable(name = "afearax_day") String afearax_day,
    		@PathVariable(name = "asidsucax") int asidsucax, @PathVariable(name = "apidprax") int apidprax){
    	
    	List<UnsquaredRangesReport> unsquaredRanges = getUnsquaredRangesUseCase.getUnsquaredRangesByFilters(afearax_year, afearax_month, afearax_day, asidsucax, apidprax);
        // Domain to response
        return new ResponseEntity<>(unsquaredRangesMapper.toListUnsquaredRangesReportEntity(unsquaredRanges), HttpStatus.OK);
    }

	
    
}

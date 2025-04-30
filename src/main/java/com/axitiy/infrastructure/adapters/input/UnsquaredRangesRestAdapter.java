
package com.axitiy.infrastructure.adapters.input;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axitiy.application.ports.input.GetUnsquaredRangesUseCase;
import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.UnsquaredRangesMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/UnsquaredRanges")
@RequiredArgsConstructor
public class UnsquaredRangesRestAdapter {
    
    private final GetUnsquaredRangesUseCase getUnsquaredRangesUseCase = null;

    private final UnsquaredRangesMapper unsquaredRangesMapper = new UnsquaredRangesMapper();

   
    @GetMapping(value = "/getUnsquaredRanges/:afearax/:asidsucax/:apidprax")
    public ResponseEntity<?> getUnsquaredRanges(@PathVariable Date afearax, @PathVariable int asidsucax, @PathVariable int apidprax){
    	List<UnsquaredRanges> product = getUnsquaredRangesUseCase.getUnsquaredRangesByFilters(afearax, asidsucax, apidprax);
        // Domain to response
        return new ResponseEntity<>(unsquaredRangesMapper.toListUnsquaredRangesEntity(product), HttpStatus.OK);
    }

	
    
}

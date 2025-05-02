package com.axitiy.infrastructure.adapters.input;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axitiy.application.ports.input.GetBranchUseCase;
import com.axitiy.domain.model.Branch;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.BranchMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Branch")
@RequiredArgsConstructor
public class BranchRestAdapter {
	
	@Autowired
	@Qualifier("beanName1")
    GetBranchUseCase getBranchUseCase;

    private final BranchMapper branchMapper = new BranchMapper();
    
    @CrossOrigin(origins = "http://localhost:4200")

   
    @GetMapping(value = "/getBranch")
    public ResponseEntity<?> getBranch(){
    	List<Branch> branch = getBranchUseCase.getAll();
        // Domain to response
        return new ResponseEntity<>(branchMapper.toListBranchEntity(branch), HttpStatus.OK);
    }

	
    
}

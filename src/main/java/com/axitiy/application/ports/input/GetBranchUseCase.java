package com.axitiy.application.ports.input;

import java.util.List;

import com.axitiy.domain.model.Branch;

public interface GetBranchUseCase {
   
	List<Branch> getAll();
    
}
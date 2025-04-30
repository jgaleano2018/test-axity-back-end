package com.axitiy.application.ports.input;

import com.axitiy.domain.model.Branch;

public interface CreateBranchUseCase {
   
	Branch createBranch(Branch branch);
    
}
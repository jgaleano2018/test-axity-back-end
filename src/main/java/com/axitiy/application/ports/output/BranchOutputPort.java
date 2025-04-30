package com.axitiy.application.ports.output;

import java.util.Optional;

import com.axitiy.domain.model.Branch;

public interface BranchOutputPort {
    
	Branch saveBranch(Branch branch);
    
    Optional<Branch> getBranchById(Long id);
    
}
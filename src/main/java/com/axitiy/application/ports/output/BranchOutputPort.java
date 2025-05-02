package com.axitiy.application.ports.output;

import java.util.List;

import com.axitiy.domain.model.Branch;

public interface BranchOutputPort {
    
    List<Branch> getAll();
    
}
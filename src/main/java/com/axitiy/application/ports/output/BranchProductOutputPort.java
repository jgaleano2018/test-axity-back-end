package com.axitiy.application.ports.output;

import com.axitiy.domain.model.BranchProduct;

public interface BranchProductOutputPort {
    
	BranchProduct saveBranchProduct(BranchProduct branchProduct);
    
}
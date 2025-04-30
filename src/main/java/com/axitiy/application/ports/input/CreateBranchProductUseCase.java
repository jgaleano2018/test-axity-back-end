package com.axitiy.application.ports.input;

import com.axitiy.domain.model.BranchProduct;

public interface CreateBranchProductUseCase {
   
	BranchProduct createBranchProduct(BranchProduct branchProduct);
    
}
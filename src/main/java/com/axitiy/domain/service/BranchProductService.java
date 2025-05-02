package com.axitiy.domain.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.application.ports.input.CreateBranchProductUseCase;
import com.axitiy.application.ports.output.BranchProductOutputPort;
import com.axitiy.domain.model.BranchProduct;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BranchProductService implements CreateBranchProductUseCase {

	@Autowired
    BranchProductOutputPort branchProductOutputPort;
    
    @Override
    public BranchProduct createBranchProduct(BranchProduct branchProduct) {
        System.out.println("Creando Sucursal x Producto");
        return branchProductOutputPort.saveBranchProduct(branchProduct);
    }
    
}
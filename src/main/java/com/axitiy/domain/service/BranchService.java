package com.axitiy.domain.service;

import com.axitiy.application.ports.input.CreateBranchUseCase;
import com.axitiy.application.ports.input.GetBranchUseCase;
import com.axitiy.application.ports.output.BranchOutputPort;
import com.axitiy.domain.exception.BranchNotFoundException;
import com.axitiy.domain.model.Branch;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BranchService implements CreateBranchUseCase, GetBranchUseCase{

    private final BranchOutputPort branchOutputPort = null;
    
    @Override
    public Branch getBranchById(Long id) {
        System.out.println("Retornando Sucursal por ID");
        return branchOutputPort.getBranchById(id)
                                .orElseThrow(() -> new BranchNotFoundException("No se encontro el sucursal con ID: " + id));
    }

    @Override
    public Branch createBranch(Branch branch) {
        System.out.println("Creando Sucursal");
        return branchOutputPort.saveBranch(branch);
    }
    
}
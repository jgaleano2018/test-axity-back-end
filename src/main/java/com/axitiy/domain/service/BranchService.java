package com.axitiy.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.axitiy.application.ports.input.GetBranchUseCase;
import com.axitiy.application.ports.output.BranchOutputPort;
import com.axitiy.domain.model.Branch;

import lombok.AllArgsConstructor;

@Component("beanName1")
@AllArgsConstructor
public class BranchService implements GetBranchUseCase{

	@Autowired
	@Qualifier("beanName2")
    BranchOutputPort branchOutputPort;
    
    @Override
    public List<Branch> getAll() {
        System.out.println("Retornando lista de Sucursales");
        return branchOutputPort.getAll();
    }

}
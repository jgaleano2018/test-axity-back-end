package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.domain.model.Branch;
import com.axitiy.infrastructure.adapters.output.persistence.entity.BranchEntity;

public class BranchMapper {

    @Autowired
    private ModelMapper mapper;

    public Branch toBranch(BranchEntity entity){
        return mapper.map(entity, Branch.class);
    }
    
    public BranchEntity toBranch(Branch branch){
        return mapper.map(branch, BranchEntity.class);
    }

}
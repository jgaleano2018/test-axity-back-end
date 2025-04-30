package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.domain.model.BranchProduct;
import com.axitiy.infrastructure.adapters.output.persistence.entity.BranchProductEntity;

public class BranchProductMapper {

    @Autowired
    private ModelMapper mapper;

    public BranchProduct toBranchProduct(BranchProductEntity entity){
        return mapper.map(entity, BranchProduct.class);
    }
    
    public BranchProductEntity toBranchProduct(BranchProduct branchProduct){
        return mapper.map(branchProduct, BranchProductEntity.class);
    }

}
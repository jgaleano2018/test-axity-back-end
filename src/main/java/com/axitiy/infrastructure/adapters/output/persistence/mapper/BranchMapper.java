package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import com.axitiy.domain.model.Branch;
import com.axitiy.infrastructure.adapters.output.persistence.entity.BranchEntity;

@Component("beanName4")
public class BranchMapper {

	private final ModelMapper mapper = new ModelMapper();

    public Branch toBranch(BranchEntity entity){
        return mapper.map(entity, Branch.class);
    }
    
    public BranchEntity toBranch(Branch branch){
        return mapper.map(branch, BranchEntity.class);
    }
    
    public List<BranchEntity> toListBranchEntity(List<Branch> branch){
        return mapper.map(branch, new TypeToken<List<BranchEntity>>() {}.getType());
    }
    
    public List<Branch> toListBranch(List<BranchEntity> branchEntity){
        return mapper.map(branchEntity, new TypeToken<List<Branch>>() {}.getType());
    }

}
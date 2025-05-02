package com.axitiy.infrastructure.adapters.output.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.axitiy.application.ports.output.BranchOutputPort;
import com.axitiy.domain.model.Branch;
import com.axitiy.infrastructure.adapters.output.persistence.entity.BranchEntity;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.BranchMapper;
import com.axitiy.infrastructure.adapters.output.persistence.repository.BranchRepository;

import lombok.RequiredArgsConstructor;

@Component("beanName2")
@RequiredArgsConstructor
public class BranchPersistenceAdapter implements BranchOutputPort {

	@Autowired
	BranchRepository branchRepository;

    private final BranchMapper branchMapper = new BranchMapper();
    
    public BranchPersistenceAdapter(BranchRepository branchRepository2,
			BranchMapper branchMapper2) {
		// TODO Auto-generated constructor stub
	}

    @Override
    public List<Branch> getAll() {
        List<BranchEntity> branchEntity = branchRepository.findAll();

        return branchMapper.toListBranch(branchEntity);
    }
    
}
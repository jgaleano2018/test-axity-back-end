package com.axitiy.infrastructure.adapters.output.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axitiy.infrastructure.adapters.output.persistence.entity.BranchEntity;

public interface BranchRepository extends JpaRepository<BranchEntity, Long>{
    
}
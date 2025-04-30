package com.axitiy.infrastructure.adapters.output.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axitiy.infrastructure.adapters.output.persistence.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
    
}
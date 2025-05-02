package com.axitiy.infrastructure.adapters.output.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.axitiy.application.ports.output.ProductOutputPort;
import com.axitiy.domain.model.Product;
import com.axitiy.infrastructure.adapters.output.persistence.entity.ProductEntity;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.ProductMapper;
import com.axitiy.infrastructure.adapters.output.persistence.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Component("beanName9")
@RequiredArgsConstructor
public class ProductPersistenceAdapter implements ProductOutputPort {

	@Autowired
	ProductRepository productRepository;

    private final ProductMapper productMapper = new ProductMapper();
    
    public ProductPersistenceAdapter(ProductRepository productRepository2,
    		ProductMapper productMapper2) {
		// TODO Auto-generated constructor stub
	}

    @Override
    public List<Product> getAll() {
        List<ProductEntity> productEntity = productRepository.findAll();

        return productMapper.toListProduct(productEntity);
    }
    
}
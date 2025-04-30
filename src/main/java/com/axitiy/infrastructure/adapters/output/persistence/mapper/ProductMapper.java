package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.domain.model.Product;
import com.axitiy.infrastructure.adapters.output.persistence.entity.ProductEntity;

public class ProductMapper {

    @Autowired
    private ModelMapper mapper;

    public Product toDocument(ProductEntity entity){
        return mapper.map(entity, Product.class);
    }
    
    public ProductEntity toProduct(Product product){
        return mapper.map(product, ProductEntity.class);
    }

}
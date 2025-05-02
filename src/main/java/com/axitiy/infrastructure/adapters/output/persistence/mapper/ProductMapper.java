package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import com.axitiy.domain.model.Product;
import com.axitiy.infrastructure.adapters.output.persistence.entity.ProductEntity;

@Component("beanName10")
public class ProductMapper {

	private final ModelMapper mapper = new ModelMapper();

    public Product toDocument(ProductEntity entity){
        return mapper.map(entity, Product.class);
    }
    
    public ProductEntity toProduct(Product product){
        return mapper.map(product, ProductEntity.class);
    }
    
    public List<ProductEntity> toListProductEntity(List<Product> product){
        return mapper.map(product, new TypeToken<List<ProductEntity>>() {}.getType());
    }
    
    public List<Product> toListProduct(List<ProductEntity> productEntity){
        return mapper.map(productEntity, new TypeToken<List<Product>>() {}.getType());
    }

}
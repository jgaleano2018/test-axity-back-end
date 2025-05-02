package com.axitiy.application.ports.input;

import java.util.List;

import com.axitiy.domain.model.Product;

public interface GetProductUseCase {
	
	List<Product> getAll();
    
}
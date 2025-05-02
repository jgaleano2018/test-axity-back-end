package com.axitiy.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.axitiy.application.ports.input.GetProductUseCase;
import com.axitiy.application.ports.output.ProductOutputPort;
import com.axitiy.domain.model.Product;

@Component("beanName8")
public class ProductService implements GetProductUseCase{

	@Autowired
	@Qualifier("beanName9")
	ProductOutputPort productOutputPort;
    
	@Override
    public List<Product> getAll() {
        System.out.println("Retornando lista de Productos");
        return productOutputPort.getAll();
    }
    
}
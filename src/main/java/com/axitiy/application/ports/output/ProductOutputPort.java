package com.axitiy.application.ports.output;

import java.util.List;

import com.axitiy.domain.model.Product;

public interface ProductOutputPort {
    
    List<Product> getAll();
    
}
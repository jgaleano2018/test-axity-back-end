package com.axitiy.infrastructure.adapters.input;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axitiy.application.ports.input.GetProductUseCase;
import com.axitiy.domain.model.Product;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.ProductMapper;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Product")
@RequiredArgsConstructor
public class ProductRestAdapter {
    
	@Autowired
	@Qualifier("beanName8")
    GetProductUseCase getProductUseCase;

    private final ProductMapper productMapper = new ProductMapper();
    
    @CrossOrigin(origins = "http://localhost:4200")

   
    @GetMapping(value = "/getProduct")
    public ResponseEntity<?> getProduct(){
    	List<Product> product = getProductUseCase.getAll();
        // Domain to response
        return new ResponseEntity<>(productMapper.toListProductEntity(product), HttpStatus.OK);
    }

}

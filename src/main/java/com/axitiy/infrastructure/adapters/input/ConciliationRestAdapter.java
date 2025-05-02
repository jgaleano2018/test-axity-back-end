package com.axitiy.infrastructure.adapters.input;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axitiy.application.ports.input.CreateBranchProductUseCase;
import com.axitiy.application.ports.input.CreateConciliationUseCase;
import com.axitiy.application.ports.input.CreateUnsquaredRangesUseCase;
import com.axitiy.domain.model.BranchProduct;
import com.axitiy.domain.model.Conciliation;
import com.axitiy.domain.model.RequestBodyConciliation;
import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.infrastructure.adapters.input.rest.data.request.UnsquaredRangesRequest;
import com.axitiy.infrastructure.adapters.input.rest.data.response.ConciliationResponse;
import com.axitiy.infrastructure.adapters.input.rest.data.request.ConciliationRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Conciliation")
@RequiredArgsConstructor
public class ConciliationRestAdapter {


	@Autowired
    CreateConciliationUseCase createConciliationUseCase;
	
	@Autowired
    CreateUnsquaredRangesUseCase createUnsquaredRangesUseCase;
	
	@Autowired(required = false)
    CreateBranchProductUseCase createBranchProductUseCase; 


    private final ModelMapper mapper = new ModelMapper();
    
    @CrossOrigin(origins = "http://localhost:4200")

    @PostMapping(value = "/createConciliation")
    public ResponseEntity<?> createConciliation(@RequestBody RequestBodyConciliation entryConciliationData){

    	try {
    		
    		List<ConciliationRequest> conciliationToCreate = entryConciliationData.getConciliationToCreate();
    		UnsquaredRangesRequest unsquaredRangesToCreate = entryConciliationData.getUnsquaredRangesToCreate();
    		String monthConciliationRequest = entryConciliationData.getMonthConciliationRequest();
    		String yearConciliationRequest = entryConciliationData.getYearConciliationRequest();
    		
    		
	    	int regsConciliation = 0;    	
	    	LocalDate currentDate = LocalDate.now();
	    	
		    // Get day from date
		    int dayActually = currentDate.getDayOfMonth();
		    
	    	String dayActuallyStr = Integer.toString(dayActually).length() == 1 ? '0'+Integer.toString(dayActually) : Integer.toString(dayActually);
	    	
	    	
	    	for (ConciliationRequest conciliationRequestItem : conciliationToCreate) {
	    		
	    		regsConciliation = 0;
	
	    		Conciliation conciliation = mapper.map(conciliationRequestItem, Conciliation.class);	    		
	    		conciliation = createConciliationUseCase.createConciliation(conciliation);
	    		
	    		
	    		if (regsConciliation == 0) {
	    			
	    			regsConciliation = this.loadConciliation(conciliation, monthConciliationRequest, yearConciliationRequest, dayActuallyStr);
	    			
	    		}
	    		
	    		if (regsConciliation == 0) {
	        		
	    			//Insert register in the table: branch_product
	    			
	    			// Request to domain
	            	//BranchProduct branchProduct = new BranchProduct(conciliation.getAsidsucax(), conciliation.getApidprax(), conciliation.getAdiddoax());
	            	
	            	BranchProduct branchProduct = new BranchProduct();
	            	
	            	branchProduct.setScidsucax(conciliation.getAsidsucax());
	            	branchProduct.setScidprax(conciliation.getApidprax());
	            	branchProduct.setSciddoax(conciliation.getAdiddoax());	            	
	            	
	            	branchProduct = createBranchProductUseCase.createBranchProduct(branchProduct);
	    			
	    		}
	    		
	    		if (regsConciliation == 1) {
	    			
	    			if (unsquaredRangesToCreate.getDconax() == dayActuallyStr) {
	    			
		    			//Register unsquared ranges initial:    			
		    			UnsquaredRanges unsquaredRanges = mapper.map(unsquaredRangesToCreate, UnsquaredRanges.class);    			
		            	unsquaredRanges = createUnsquaredRangesUseCase.createUnsquaredRanges(unsquaredRanges);
	            	
	    			}
	            	
	    		}
	    		else {
	    			
	    			this.loadUnsquaredRanges(conciliation, monthConciliationRequest, yearConciliationRequest, dayActuallyStr);
	    		}
	            
	        }
	    	
	    	return new ResponseEntity<>(mapper.map(conciliationToCreate, ConciliationResponse.class), HttpStatus.CREATED);
    	
    	} catch (Exception e) {
    		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    	}
        
    }

	public int loadConciliation(Conciliation conciliation, String monthFilter, String yearFilter, String dayActuallyStr) {

    	int regsConciliation = 0;
    	
    	if (regsConciliation == 0) {
    	
    		Date date = conciliation.getAfearax();
    		Calendar calendar = Calendar.getInstance();
    		calendar.setTime(date);

    		int monthArax = calendar.get(Calendar.MONTH);		//1
    		int yearArax = calendar.get(Calendar.YEAR);	
    		
    		String monthAraxStr = Integer.toString(monthArax).length() == 1 ? '0'+Integer.toString(monthArax) : Integer.toString(monthArax);
    		String yearAraxStr = Integer.toString(yearArax);
    		
    		
    		if (conciliation.getAresax() == "D") {				
				
				//Se lee la carga de descuadres
				this.loadUnsquaredRanges(conciliation, monthAraxStr, yearAraxStr, dayActuallyStr);				
				
    		}
    		
    		
    		if (monthAraxStr == monthFilter && yearAraxStr == yearFilter) {
    		
    			if (conciliation.getAresax() == "D") {    				
    				
    				//Se lee la carga de descuadres
    				this.loadUnsquaredRanges(conciliation, monthAraxStr, yearAraxStr, dayActuallyStr);    				
    			
    			}
    			else {
    			
    				regsConciliation = 1;
    				
    			}
    			
    		
    		}
    		else {
    		
    			regsConciliation = 1;
    		
    		}
    	
    	
    	}
    	
    	return regsConciliation;

    }


    public boolean loadUnsquaredRanges(Conciliation conciliation, String monthFilter, String yearFilter, String dayActuallyStr) {

    	//Se inserta en la tabla de UnsquaredRanges el registro de Conciliation and month and year filters:
    	
        try {
            
        	// Request to domain
        	UnsquaredRanges unsquaredRanges = new UnsquaredRanges(yearFilter, monthFilter, dayActuallyStr, conciliation.getAsidsucax(), conciliation.getApidprax(), conciliation.getAdiddoax(), conciliation.getAfearax(), conciliation.getAdifax(), conciliation.getAsfarax(), conciliation.getAresax());
        	unsquaredRanges = createUnsquaredRangesUseCase.createUnsquaredRanges(unsquaredRanges);
        	
        	
        } catch (Exception e) {
            return false;
        }
    	
    	
    	return true;
    }
    
}
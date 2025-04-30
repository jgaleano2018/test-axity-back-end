package com.axitiy.infrastructure.adapters.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.axitiy.domain.service.ConciliationService;
import com.axitiy.domain.service.UnsquaredRangesService;
import com.axitiy.infrastructure.adapters.output.persistence.ConciliationPersistenceAdapter;
import com.axitiy.infrastructure.adapters.output.persistence.UnsquaredRangesPersistenceAdapter;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.ConciliationMapper;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.UnsquaredRangesMapper;
import com.axitiy.infrastructure.adapters.output.persistence.repository.ConciliationRepository;
import com.axitiy.infrastructure.adapters.output.persistence.repository.UnsquaredRangesRepository;


/**
 * Configuracion BEANS
 */
@Configuration
public class BeanConfiguration {
    
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public ConciliationMapper conciliationMapper(){
        return new ConciliationMapper();
    }
    
    @Bean
    public ConciliationPersistenceAdapter conciliationPersistenceAdapter(ConciliationRepository conciliationRepository, ConciliationMapper conciliationMapper) {
        return new ConciliationPersistenceAdapter(conciliationRepository, conciliationMapper);
    }

    @Bean
    public ConciliationService conciliationService(ConciliationPersistenceAdapter conciliationPersistenceAdapter) {
        return new ConciliationService(conciliationPersistenceAdapter);
    }
    
    
    @Bean
    public UnsquaredRangesMapper unsquaredRangesMapper(){
        return new UnsquaredRangesMapper();
    }
    
    @Bean
    public UnsquaredRangesPersistenceAdapter unsquaredRangesPersistenceAdapter(UnsquaredRangesRepository unsquaredRangesRepository, UnsquaredRangesMapper unsquaredRangesMapper) {
        return new UnsquaredRangesPersistenceAdapter(unsquaredRangesRepository, unsquaredRangesMapper);
    }

    @Bean
    public UnsquaredRangesService unsquaredRangesService(UnsquaredRangesPersistenceAdapter unsquaredRangesPersistenceAdapter) {
        return new UnsquaredRangesService(unsquaredRangesPersistenceAdapter);
    }


}
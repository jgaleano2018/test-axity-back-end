package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import com.axitiy.domain.model.Conciliation;
import com.axitiy.infrastructure.adapters.output.persistence.entity.ConciliationEntity;


public class ConciliationMapper {
	
	private final ModelMapper mapper = new ModelMapper();

    public Conciliation toConciliation(ConciliationEntity entity){
        return mapper.map(entity, Conciliation.class);
    }
    
    public ConciliationEntity toEntity(Conciliation conciliation){
        return mapper.map(conciliation, ConciliationEntity.class);
    }

    public List<Conciliation> toListConciliation(List<ConciliationEntity> conciliationEntity){
        return mapper.map(conciliationEntity, new TypeToken<List<Conciliation>>() {}.getType());
    }
}
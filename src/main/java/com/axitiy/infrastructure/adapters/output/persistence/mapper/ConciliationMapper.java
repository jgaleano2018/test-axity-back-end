package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.domain.model.Conciliation;
import com.axitiy.infrastructure.adapters.output.persistence.entity.ConciliationEntity;


public class ConciliationMapper {

    @Autowired
    private ModelMapper mapper;

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
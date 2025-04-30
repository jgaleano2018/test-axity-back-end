package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.infrastructure.adapters.output.persistence.entity.UnsquaredRangesEntity;


public class UnsquaredRangesMapper {

    @Autowired
    private ModelMapper mapper;

    public UnsquaredRanges toUnsquaredRanges(UnsquaredRangesEntity entity){
        return mapper.map(entity, UnsquaredRanges.class);
    }
    
    public UnsquaredRangesEntity toEntity(UnsquaredRanges unsquaredRanges){
        return mapper.map(unsquaredRanges, UnsquaredRangesEntity.class);
    }
    
    public List<UnsquaredRangesEntity> toListUnsquaredRangesEntity(List<UnsquaredRanges> unsquaredRanges){
        return mapper.map(unsquaredRanges, new TypeToken<List<UnsquaredRanges>>() {}.getType());
    }
    
    public List<UnsquaredRanges> toListUnsquaredRanges(List<UnsquaredRangesEntity> unsquaredRangesEntity){
        return mapper.map(unsquaredRangesEntity, new TypeToken<List<UnsquaredRanges>>() {}.getType());
    }


}
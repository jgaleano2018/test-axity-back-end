package com.axitiy.infrastructure.adapters.output.persistence.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.domain.model.UnsquaredRangesReport;
import com.axitiy.infrastructure.adapters.output.persistence.entity.UnsquaredRangesEntity;
import com.axitiy.infrastructure.adapters.output.persistence.entity.UnsquaredRangesReportEntity;


public class UnsquaredRangesMapper {

	private final ModelMapper mapper = new ModelMapper();

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

    
    public List<UnsquaredRangesReportEntity> toListUnsquaredRangesReportEntity(List<UnsquaredRangesReport> unsquaredRangesReport){
        return mapper.map(unsquaredRangesReport, new TypeToken<List<UnsquaredRangesReport>>() {}.getType());
    }
    
    public List<UnsquaredRangesReport> toListUnsquaredRangesReport(List<UnsquaredRangesReportEntity> unsquaredRangesReportEntity){
        return mapper.map(unsquaredRangesReportEntity, new TypeToken<List<UnsquaredRangesReport>>() {}.getType());
    }
}
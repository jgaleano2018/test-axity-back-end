package com.axitiy.infrastructure.adapters.output.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.application.ports.output.UnsquaredRangesOutputPort;
import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.domain.model.UnsquaredRangesReport;
import com.axitiy.infrastructure.adapters.output.persistence.entity.UnsquaredRangesEntity;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.UnsquaredRangesMapper;
import com.axitiy.infrastructure.adapters.output.persistence.repository.UnsquaredRangesRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UnsquaredRangesPersistenceAdapter implements UnsquaredRangesOutputPort {
	
	@Autowired
    UnsquaredRangesRepository unsquaredRangesRepository;

    private final UnsquaredRangesMapper unsquaredRangesMapper = new UnsquaredRangesMapper();
    
    public UnsquaredRangesPersistenceAdapter(UnsquaredRangesRepository unsquaredRangesRepository2,
			UnsquaredRangesMapper unsquaredRangesMapper2) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public UnsquaredRanges saveUnsquaredRanges(UnsquaredRanges unsquaredRanges) {
    	UnsquaredRangesEntity unsquaredRangesEntity = unsquaredRangesMapper.toEntity(unsquaredRanges);
    	unsquaredRangesRepository.save(unsquaredRangesEntity);
        return unsquaredRangesMapper.toUnsquaredRanges(unsquaredRangesEntity);
    }

    @Override
    public Optional<UnsquaredRanges> getUnsquaredRangesById(Long id) {
        Optional<UnsquaredRangesEntity> unsquaredRangesEntity = unsquaredRangesRepository.findById(id);

        if(unsquaredRangesEntity.isEmpty()) {
            return Optional.empty();
        }

        UnsquaredRanges unsquaredRanges = unsquaredRangesMapper.toUnsquaredRanges(unsquaredRangesEntity.get());
        return Optional.of(unsquaredRanges);
    }
    
    @Override
    public List<UnsquaredRangesReport> getUnsquaredRangesByFilters(String afearax_year, String afearax_month, String afearax_day, int asidsucax, int apidprax) {
    	List<UnsquaredRangesReport> unsquaredRanges = unsquaredRangesRepository.findByUnsquaredRanges(afearax_year, afearax_month, afearax_day, asidsucax, apidprax);
        return unsquaredRanges;
    }
    
}
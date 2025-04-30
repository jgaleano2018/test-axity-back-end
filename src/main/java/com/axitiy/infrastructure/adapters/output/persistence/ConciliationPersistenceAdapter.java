package com.axitiy.infrastructure.adapters.output.persistence;

import java.util.Optional;

import com.axitiy.application.ports.output.ConciliationOutputPort;
import com.axitiy.domain.model.Conciliation;
import com.axitiy.infrastructure.adapters.output.persistence.entity.ConciliationEntity;
import com.axitiy.infrastructure.adapters.output.persistence.mapper.ConciliationMapper;
import com.axitiy.infrastructure.adapters.output.persistence.repository.ConciliationRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConciliationPersistenceAdapter implements ConciliationOutputPort {

    private final ConciliationRepository conciliationRepository = null;

    private final ConciliationMapper conciliationMapper = new ConciliationMapper();
    
    public ConciliationPersistenceAdapter(ConciliationRepository conciliationRepository2,
			ConciliationMapper conciliationMapper2) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public Conciliation saveConciliation(Conciliation conciliation) {
    	ConciliationEntity conciliationEntity = conciliationMapper.toEntity(conciliation);
    	conciliationRepository.save(conciliationEntity);
        return conciliationMapper.toConciliation(conciliationEntity);
    }

    @Override
    public Optional<Conciliation> getConciliationById(Long id) {
        Optional<ConciliationEntity> conciliationEntity = conciliationRepository.findById(id);

        if(conciliationEntity.isEmpty()) {
            return Optional.empty();
        }

        Conciliation conciliation = conciliationMapper.toConciliation(conciliationEntity.get());
        return Optional.of(conciliation);
    }
    
}
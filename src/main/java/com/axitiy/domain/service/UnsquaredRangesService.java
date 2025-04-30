package com.axitiy.domain.service;

import java.util.Date;
import java.util.List;

import com.axitiy.application.ports.input.CreateUnsquaredRangesUseCase;
import com.axitiy.application.ports.input.GetUnsquaredRangesUseCase;
import com.axitiy.application.ports.output.UnsquaredRangesOutputPort;
import com.axitiy.domain.exception.UnsquaredRangesNotFoundException;
import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.infrastructure.adapters.output.persistence.UnsquaredRangesPersistenceAdapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UnsquaredRangesService implements CreateUnsquaredRangesUseCase, GetUnsquaredRangesUseCase{

    private final UnsquaredRangesOutputPort unsquaredRangesOutputPort = null;
    
    public UnsquaredRangesService(UnsquaredRangesPersistenceAdapter unsquaredRangesPersistenceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public UnsquaredRanges getUnsquaredRangesById(Long id) {
        System.out.println("Retornando Descuadres por ID");
        return unsquaredRangesOutputPort.getUnsquaredRangesById(id)
                                .orElseThrow(() -> new UnsquaredRangesNotFoundException("No se encontro los descuadres con ID: " + id));
    }

    @Override
    public UnsquaredRanges createUnsquaredRanges(UnsquaredRanges unsquaredRanges) {
        System.out.println("Creando Descuadres");
        return unsquaredRangesOutputPort.saveUnsquaredRanges(unsquaredRanges);
    }
    
    
    @Override
    public List<UnsquaredRanges> getUnsquaredRangesByFilters(Date afearax, int asidsucax, int apidprax) {
        System.out.println("Retornando descuadres por fecha, sucursal y producto");
        return unsquaredRangesOutputPort.getUnsquaredRangesByFilters(afearax, asidsucax, apidprax);
    }
}
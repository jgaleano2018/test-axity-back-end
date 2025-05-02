package com.axitiy.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.axitiy.application.ports.input.CreateUnsquaredRangesUseCase;
import com.axitiy.application.ports.input.GetUnsquaredRangesUseCase;
import com.axitiy.application.ports.output.UnsquaredRangesOutputPort;
import com.axitiy.domain.exception.UnsquaredRangesNotFoundException;
import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.domain.model.UnsquaredRangesReport;
import com.axitiy.infrastructure.adapters.output.persistence.UnsquaredRangesPersistenceAdapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UnsquaredRangesService implements CreateUnsquaredRangesUseCase, GetUnsquaredRangesUseCase{

	@Autowired
    UnsquaredRangesOutputPort unsquaredRangesOutputPort;
    
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
    public List<UnsquaredRangesReport> getUnsquaredRangesByFilters(String afearax_year, String afearax_month, String afearax_day, int asidsucax, int apidprax) {
        System.out.println("Retornando descuadres por fecha, sucursal y producto");
        return unsquaredRangesOutputPort.getUnsquaredRangesByFilters(afearax_year, afearax_month, afearax_day, asidsucax, apidprax);
    }
}
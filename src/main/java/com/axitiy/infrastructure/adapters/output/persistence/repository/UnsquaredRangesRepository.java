package com.axitiy.infrastructure.adapters.output.persistence.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.axitiy.domain.model.UnsquaredRanges;
import com.axitiy.infrastructure.adapters.output.persistence.entity.UnsquaredRangesEntity;

public interface UnsquaredRangesRepository extends JpaRepository<UnsquaredRangesEntity, Long>{
	
	@Query(value="select ur.id, ur.danoax, ur.dmesax, ur.dconax, ur.dsidsucax, d.scodsucax, d.snomsucax, ur.dpidprax, p.pcodprax, p.pnomprax, ur.ddiddoax, d.dcoddoax, d.dnomdoax, ur.ddifax, ur.dsfarax, ur.dresax "
	+ "from unsquared_ranges ur INNER JOIN branch b ON b.sidsucax = ur.dsidsucax " 
	+ "INNER JOIN document d ON d.diddoax = ur.ddiddoax "
	+ "INNER JOIN product p ON p.pidprax = ur.dpidprax "
	+ "where ur.dfearax = ?1 and ur.dsidsucax = ?2 and ur.dpidprax = ?3", nativeQuery = true)
	List<UnsquaredRanges> findByUnsquaredRanges(Date afearax, int asidsucax, int apidprax);
	
	
	//@Query(value = "select * from employee e where e.email_address = ?1", nativeQuery = true)
    
}
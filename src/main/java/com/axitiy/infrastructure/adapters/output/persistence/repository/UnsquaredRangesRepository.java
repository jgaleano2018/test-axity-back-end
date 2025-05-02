package com.axitiy.infrastructure.adapters.output.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.axitiy.domain.model.UnsquaredRangesReport;
import com.axitiy.infrastructure.adapters.output.persistence.entity.UnsquaredRangesEntity;

public interface UnsquaredRangesRepository extends JpaRepository<UnsquaredRangesEntity, Long>{
	
	@Query(value="SELECT ur.id, ur.danoax, ur.dmesax, ur.dconax, ur.dsidsucax, b.scodsucax, b.snomsucax, ur.dpidprax, p.pcodprax, p.pnomprax, ur.ddiddoax, d.dcoddoax, d.dnomdoax, ur.dfearax, ur.ddifax, ur.dsfarax, ur.dresax "
	+ "FROM unsquared_ranges ur INNER JOIN branch b ON b.sidsucax = ur.dsidsucax INNER JOIN document d ON d.diddoax = ur.ddiddoax INNER JOIN product p ON p.pidprax = ur.dpidprax "
	+ "WHERE DATE_PART('year', ur.dfearax)::text = ?1 AND (CASE WHEN LENGTH(DATE_PART('month', ur.dfearax)::text) = 1 THEN CONCAT('0',DATE_PART('month', ur.dfearax)::text) ELSE DATE_PART('month', ur.dfearax)::text END) = ?2 AND (CASE WHEN LENGTH(DATE_PART('day', ur.dfearax)::text) = 1 THEN CONCAT('0',DATE_PART('day', ur.dfearax)::text) ELSE DATE_PART('day', ur.dfearax)::text END) = ?3 \r\n"
	+ " AND ur.dsidsucax = ?4 AND ur.dpidprax = ?5", nativeQuery = true)
	List<UnsquaredRangesReport> findByUnsquaredRanges(String afearax_year, String afearax_month, String afearax_day, int asidsucax, int apidprax);
    
}
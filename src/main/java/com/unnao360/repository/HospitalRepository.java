package com.unnao360.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {
	Page<Hospital> findByVillageId(long villageId,Pageable pageable);
	long countByVillageId(long villageId);
	List<Hospital> findByNameContainingIgnoreCase(String name);
	long countByVillageId(Long villageId);



}

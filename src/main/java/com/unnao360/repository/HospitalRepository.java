package com.unnao360.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital,Long> {
	List<Hospital> findByVillageId(long villageId);
	long countByVillageId(long villageId);
	List<Hospital> findByNameContainingIgnoreCase(String name);


}

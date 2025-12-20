package com.unnao360.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.PoliceStation;

public interface PoliceStationRepository extends JpaRepository<PoliceStation,Long> {
	Page<PoliceStation> findByVillageId(long villageId,Pageable pageable);
	List<PoliceStation> findByNameContainingIgnoreCase(String name);
	long countByVillageId(Long villageId);



}

package com.unnao360.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.PoliceStation;

public interface PoliceStationRepository extends JpaRepository<PoliceStation,Long> {
	List<PoliceStation> findByVillageId(long villageId);

}

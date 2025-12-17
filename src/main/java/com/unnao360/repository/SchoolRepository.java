package com.unnao360.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.School;

public interface SchoolRepository extends JpaRepository<School,Long> {
	List<School> findByVillageId(long villageId);
	long countByVillageId(long villageId);

}

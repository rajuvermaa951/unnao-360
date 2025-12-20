package com.unnao360.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.School;

public interface SchoolRepository extends JpaRepository<School,Long> {
	Page<School> findByVillageId(long villageId,Pageable pageable);
	long countByVillageId(long villageId);
	List<School> findByNameContainingIgnoreCase(String name);
	long countByVillageId(Long villageId);


}

package com.unnao360.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.Village;

public interface VillageRepository extends JpaRepository<Village,Long>{
	Page<Village> findByBlockId(Long blockId, Pageable pageable);
List<Village> findByNameContainingIgnoreCase(String name);
long countByBlockId(Long blockId);


}

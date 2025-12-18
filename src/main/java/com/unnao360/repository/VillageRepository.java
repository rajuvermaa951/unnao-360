package com.unnao360.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.Village;

public interface VillageRepository extends JpaRepository<Village,Long>{
List<Village> findByBlockId(long blockId);
List<Village> findByNameContainingIgnoreCase(String name);

}

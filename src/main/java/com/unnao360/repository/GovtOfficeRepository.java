package com.unnao360.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.GovtOffice;

public interface GovtOfficeRepository extends JpaRepository<GovtOffice,Long> {
 Page<GovtOffice> findByVillageId(long villageId,Pageable pageable);
 List<GovtOffice> findByNameContainingIgnoreCase(String name);
 long countByVillageId(Long villageId);


}

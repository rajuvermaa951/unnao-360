package com.unnao360.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.GovtOffice;

public interface GovtOfficeRepository extends JpaRepository<GovtOffice,Long> {
 List<GovtOffice> findByVillageId(long villageId);
 List<GovtOffice> findByNameContainingIgnoreCase(String name);

}

package com.unnao360.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.Tehsil;

public interface TehsilRepository extends JpaRepository<Tehsil,Long> {
Page<Tehsil> findByDistrictId(long districtId,Pageable pageable);
}

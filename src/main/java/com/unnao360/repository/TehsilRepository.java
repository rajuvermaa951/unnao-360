package com.unnao360.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.Tehsil;

public interface TehsilRepository extends JpaRepository<Tehsil,Long> {
List<Tehsil> findByDistrictId(long districtId);
}

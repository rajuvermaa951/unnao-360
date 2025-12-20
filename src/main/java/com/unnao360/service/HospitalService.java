package com.unnao360.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.unnao360.dto.HospitalDto;
import com.unnao360.entity.Hospital;

public interface HospitalService {
	Hospital createHospital(long villageId,Hospital hospital);
	Page<HospitalDto> getHospitalsByVillage(long villgeId,Pageable pageable);

}

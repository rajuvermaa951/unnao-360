package com.unnao360.service;

import java.util.List;

import com.unnao360.dto.HospitalDto;
import com.unnao360.entity.Hospital;

public interface HospitalService {
	Hospital createHospital(long villageId,Hospital hospital);
	List<HospitalDto> getHospitalsByVillage(long villgeId);

}

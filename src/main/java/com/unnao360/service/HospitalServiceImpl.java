package com.unnao360.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.unnao360.dto.HospitalDto;
import com.unnao360.entity.Hospital;
import com.unnao360.entity.Village;
import com.unnao360.mapper.HospitalMapper;
import com.unnao360.repository.HospitalRepository;
import com.unnao360.repository.VillageRepository;
@Service
public class HospitalServiceImpl implements HospitalService {
	private final HospitalRepository hospitalRepository;
	private final VillageRepository villageRepository;
	public HospitalServiceImpl(HospitalRepository hospitalRepository,VillageRepository villageRepository)
	{
		this.hospitalRepository=hospitalRepository;
		this.villageRepository=villageRepository;
	}

	@Override
	public Hospital createHospital(long villageId, Hospital hospital) {
		Village village =villageRepository.findById(villageId).orElseThrow(()->new RuntimeException("Village not found"));
		hospital.setVillage(village);
		return hospitalRepository.save(hospital);
	}

	@Override
	public Page<HospitalDto> getHospitalsByVillage(long villgeId,Pageable pageable) {
		return hospitalRepository.findByVillageId(villgeId,pageable)
				.map(HospitalMapper::toDto);
				
	}

}

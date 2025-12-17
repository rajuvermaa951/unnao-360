package com.unnao360.mapper;

import com.unnao360.dto.HospitalDto;
import com.unnao360.entity.Hospital;

public class HospitalMapper {
	public static HospitalDto toDto(Hospital hospital)
	{
		HospitalDto dto=new HospitalDto();
		dto.setId(hospital.getId());
		dto.setName(hospital.getName());
		dto.setType(hospital.getType());
		dto.setEmergencyAvailable(hospital.isEmergencyAvailable());
		dto.setVillageId(hospital.getVillage().getId());
		return dto;
	}

}

package com.unnao360.mapper;

import com.unnao360.dto.PoliceStationDto;
import com.unnao360.entity.PoliceStation;

public class PoliceStationMapper {
	public static PoliceStationDto toDto(PoliceStation policeStation)
	{
		PoliceStationDto dto=new PoliceStationDto();
		dto.setId(policeStation.getId());
		dto.setName(policeStation.getName());
		dto.setContactNumber(policeStation.getContactNumber());
		dto.setVillageId(policeStation.getVillage().getId());
		return dto;
	}
	

}

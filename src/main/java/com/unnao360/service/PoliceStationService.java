package com.unnao360.service;

import java.util.List;

import com.unnao360.dto.PoliceStationDto;
import com.unnao360.entity.PoliceStation;

public interface PoliceStationService {
	PoliceStation createPoliceStation(long villageId,PoliceStation policeStation);
	List<PoliceStationDto> getPoliceStationsByVillage(long villageId);

}

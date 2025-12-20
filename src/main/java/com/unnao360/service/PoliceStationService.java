package com.unnao360.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.unnao360.dto.PoliceStationDto;
import com.unnao360.entity.PoliceStation;

public interface PoliceStationService {
	PoliceStation createPoliceStation(long villageId,PoliceStation policeStation);
	Page<PoliceStationDto> getPoliceStationsByVillage(long villageId,Pageable pageable);

}

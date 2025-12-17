package com.unnao360.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unnao360.dto.PoliceStationDto;
import com.unnao360.entity.PoliceStation;
import com.unnao360.entity.Village;
import com.unnao360.mapper.PoliceStationMapper;
import com.unnao360.repository.PoliceStationRepository;
import com.unnao360.repository.VillageRepository;

@Service
public class PoliceStationServiceImpl implements PoliceStationService {
	private final VillageRepository villageRepository;
	private final PoliceStationRepository policeStationRepository;
	
	public PoliceStationServiceImpl(VillageRepository villageRepository,
			                        PoliceStationRepository policeStationRepository){
		this.policeStationRepository=policeStationRepository;
		this.villageRepository=villageRepository;
		
	}
	

	@Override
	public PoliceStation createPoliceStation(long villageId, PoliceStation policeStation) {
		Village village=villageRepository.findById(villageId).orElseThrow(()-> new RuntimeException("Village not found"));
		policeStation.setVillage(village);
		
		return policeStationRepository.save(policeStation);
	}

	@Override
	public List<PoliceStationDto> getPoliceStationsByVillage(long villageId) {
		return policeStationRepository.findByVillageId(villageId).stream().map(PoliceStationMapper::toDto).toList() ;
	}
	

}

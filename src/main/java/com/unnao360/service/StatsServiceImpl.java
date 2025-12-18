package com.unnao360.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unnao360.dto.StatsDto;
import com.unnao360.repository.GovtOfficeRepository;
import com.unnao360.repository.HospitalRepository;
import com.unnao360.repository.PoliceStationRepository;
import com.unnao360.repository.SchoolRepository;
import com.unnao360.repository.VillageRepository;

@Service
public class StatsServiceImpl implements StatsService{
    private final SchoolRepository schoolRepo;
    private final HospitalRepository hospitalRepo;
    private final PoliceStationRepository policeRepo;
    private final GovtOfficeRepository govtRepo;
    private final VillageRepository villageRepo;

    public StatsServiceImpl(
            SchoolRepository schoolRepo,
            HospitalRepository hospitalRepo,
            PoliceStationRepository policeRepo,
            GovtOfficeRepository govtRepo,
            VillageRepository villageRepo) {

        this.schoolRepo = schoolRepo;
        this.hospitalRepo = hospitalRepo;
        this.policeRepo = policeRepo;
        this.govtRepo = govtRepo;
        this.villageRepo = villageRepo;
    }


	@Override
	public List<StatsDto> getVillageStats(long villageId) {

        return List.of(
                new StatsDto("Schools", schoolRepo.countByVillageId(villageId)),
                new StatsDto("Hospitals", hospitalRepo.countByVillageId(villageId)),
                new StatsDto("Police Stations", policeRepo.countByVillageId(villageId)),
                new StatsDto("Government Offices", govtRepo.countByVillageId(villageId))
        );	}

	@Override
	public List<StatsDto> getBlockStats(long blockId) {
		  return List.of(
	                new StatsDto("Villages", villageRepo.countByBlockId(blockId))
	        );	}

}

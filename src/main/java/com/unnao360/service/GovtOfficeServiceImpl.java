package com.unnao360.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unnao360.dto.GovtOfficeDto;
import com.unnao360.entity.GovtOffice;
import com.unnao360.entity.Village;
import com.unnao360.mapper.GovtOfficeMapper;
import com.unnao360.repository.GovtOfficeRepository;
import com.unnao360.repository.VillageRepository;

@Service
public class GovtOfficeServiceImpl implements GovtOfficeService {
	private final VillageRepository villageRepository;
	private final GovtOfficeRepository govtOfficeRepository;
	public GovtOfficeServiceImpl(VillageRepository villageRepository,GovtOfficeRepository govtOfficeRepository)
	{
		this.govtOfficeRepository=govtOfficeRepository;
		this.villageRepository=villageRepository;
	}
	@Override
	public GovtOffice createGovtOffice(long villageId, GovtOffice govtOffice) {
		
		Village village=villageRepository.findById(villageId).orElseThrow(()->new RuntimeException("Village not found"));
		govtOffice.setVillage(village);
		return govtOfficeRepository.save(govtOffice);
	}
	@Override
	public List<GovtOfficeDto> getGovtOfficeByVillageId(long villageId) {
		return govtOfficeRepository.findByVillageId(villageId).stream().map(GovtOfficeMapper::toDto).toList();
	}

}

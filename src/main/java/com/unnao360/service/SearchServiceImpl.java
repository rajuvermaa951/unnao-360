package com.unnao360.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.unnao360.dto.SearchResultDto;
import com.unnao360.entity.GovtOffice;
import com.unnao360.entity.Hospital;
import com.unnao360.entity.PoliceStation;
import com.unnao360.entity.School;
import com.unnao360.entity.Village;
import com.unnao360.repository.GovtOfficeRepository;
import com.unnao360.repository.HospitalRepository;
import com.unnao360.repository.PoliceStationRepository;
import com.unnao360.repository.SchoolRepository;
import com.unnao360.repository.VillageRepository;
@Service
public class SearchServiceImpl implements SearchService{
     
	private final VillageRepository villageRepository;
	private final PoliceStationRepository policeStationRepository;
	private final HospitalRepository hospitalRepository;
	private final SchoolRepository schoolRepository;
	private final GovtOfficeRepository govtOfficeRepository;
	 
	public SearchServiceImpl(
			VillageRepository villageRepository,
			PoliceStationRepository policeStationRepository,
			HospitalRepository hospitalRepository,
			SchoolRepository schoolRepository,
			GovtOfficeRepository govtOfficeRepository
			
			)
	{
		this.govtOfficeRepository=govtOfficeRepository;
		this.hospitalRepository=hospitalRepository;
		this.policeStationRepository=policeStationRepository;
		this.schoolRepository=schoolRepository;
		this.villageRepository=villageRepository;
	
	}
	
	
	
	
	

	@Override
	public List<SearchResultDto> searchByName(String keyword) {
		List<SearchResultDto> results=new ArrayList<>();
		
		for(Village v:villageRepository.findByNameContainingIgnoreCase(keyword))
		{
			
		SearchResultDto dto=new SearchResultDto();
		dto.setType("VILLAGE");
		dto.setId(v.getId());
		dto.setBlockId(v.getBlock().getId());
		dto.setName(v.getName());
		dto.setDistrictId(v.getBlock().getTehsil().getDistrict().getId());
		dto.setTehsilId(v.getBlock().getTehsil().getId());
		dto.setVillageId(v.getId());
		results.add(dto);
		}
		
		for(Hospital h:hospitalRepository.findByNameContainingIgnoreCase(keyword))
		{
			SearchResultDto dto=new SearchResultDto();
			dto.setType("HOSPITAL");
			dto.setId(h.getId());
			dto.setName(h.getName());
			dto.setBlockId(h.getVillage().getBlock().getId());
			dto.setTehsilId(h.getVillage().getBlock().getTehsil().getId());
			dto.setDistrictId(h.getVillage().getBlock().getTehsil().getDistrict().getId());
			dto.setVillageId(h.getVillage().getId());
			results.add(dto);
		}
		
		for(School s: schoolRepository.findByNameContainingIgnoreCase(keyword))
		{
			SearchResultDto dto=new SearchResultDto();

			dto.setType("SCHOOL");
			dto.setId(s.getId());
			dto.setName(s.getName());
			dto.setVillageId(s.getVillage().getId());
			dto.setBlockId(s.getVillage().getBlock().getId());
			dto.setTehsilId(s.getVillage().getBlock().getTehsil().getId());
			dto.setDistrictId(s.getVillage().getBlock().getTehsil().getDistrict().getId());
			results.add(dto);	
		}
		for(GovtOffice g:govtOfficeRepository.findByNameContainingIgnoreCase(keyword))
		{
			SearchResultDto dto=new SearchResultDto();
			
			dto.setType("GOVTOFFICE");
			dto.setId(g.getId());
			dto.setBlockId(g.getVillage().getBlock().getId());
			dto.setDistrictId(g.getVillage().getBlock().getTehsil().getDistrict().getId());
			dto.setTehsilId(g.getVillage().getBlock().getTehsil().getId());
			dto.setName(g.getName());
			dto.setVillageId(g.getVillage().getId());
			results.add(dto);
		}
		for(PoliceStation p:policeStationRepository.findByNameContainingIgnoreCase(keyword))
		{
			SearchResultDto dto=new SearchResultDto();
			
			dto.setType("POLICE_STATION");
			dto.setId(p.getId());
			dto.setBlockId(p.getVillage().getBlock().getId());
			dto.setDistrictId(p.getVillage().getBlock().getTehsil().getDistrict().getId());
			dto.setTehsilId(p.getVillage().getBlock().getTehsil().getId());
			dto.setName(p.getName());
			dto.setVillageId(p.getVillage().getId());
			results.add(dto);
		}
		return results;
	}

}

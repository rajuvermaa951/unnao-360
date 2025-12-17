package com.unnao360.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unnao360.dto.SchoolDto;
import com.unnao360.entity.School;
import com.unnao360.entity.Village;
import com.unnao360.mapper.SchoolMapper;
import com.unnao360.repository.SchoolRepository;
import com.unnao360.repository.VillageRepository;

@Service
public class SchoolServiceImpl implements SchoolService {
private final SchoolRepository schoolRepository;
private final VillageRepository villageRepository;
public SchoolServiceImpl(SchoolRepository schoolRepository,
		                 VillageRepository villageRepository)
{
	this.schoolRepository=schoolRepository;
	this.villageRepository=villageRepository;
}

	@Override
	public School createSchool(long villageId, School school) {
		Village village  =villageRepository.findById(villageId).orElseThrow(()->new RuntimeException("Village not found"));
		school.setVillage(village);
		return schoolRepository.save(school);
	}

	@Override
	public List<SchoolDto> getSchoolsByVillage(long villageId) {
		return schoolRepository.findByVillageId(villageId).stream().map(SchoolMapper::toDto).toList();
	}

}

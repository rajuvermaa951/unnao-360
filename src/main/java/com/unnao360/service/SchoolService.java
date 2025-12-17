package com.unnao360.service;

import java.util.List;

import com.unnao360.dto.SchoolDto;
import com.unnao360.entity.School;

public interface SchoolService {
	
	School createSchool(long villageId,School school);
	List<SchoolDto> getSchoolsByVillage(long villageId);

}

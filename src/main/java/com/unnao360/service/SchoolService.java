package com.unnao360.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.unnao360.dto.SchoolDto;
import com.unnao360.entity.School;

public interface SchoolService {
	
	School createSchool(long villageId,School school);
	Page<SchoolDto> getSchoolsByVillage(long villageId,Pageable pageable);

}

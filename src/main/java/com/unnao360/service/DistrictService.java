package com.unnao360.service;

import java.util.List;

import com.unnao360.dto.DistrictDto;
import com.unnao360.entity.District;

public interface DistrictService {
	
	 District createDistrict(District district) ;
	 
	 List<DistrictDto> getAllDistrict();
	
	
	

}

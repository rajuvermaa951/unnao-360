package com.unnao360.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unnao360.entity.District;

public interface DistrictService {
	
	 District createDistrict(District district) ;
	 
	 List<District> getAllDistrict();
	
	
	

}

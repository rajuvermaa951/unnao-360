package com.unnao360.service;

import java.util.List;

import com.unnao360.entity.Tehsil;

public interface TehsilService {
	Tehsil createTehsil(long ditrictId,Tehsil tehsil);
	List<Tehsil> getTehsilByDistrict(long districtId);
	
}

package com.unnao360.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.unnao360.dto.TehsilDto;
import com.unnao360.entity.Tehsil;

public interface TehsilService {
	Tehsil createTehsil(long ditrictId,Tehsil tehsil);
	Page<TehsilDto> getTehsilByDistrict(long districtId,Pageable pageable);
	
}

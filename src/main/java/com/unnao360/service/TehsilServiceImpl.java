package com.unnao360.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.unnao360.dto.TehsilDto;
import com.unnao360.entity.District;
import com.unnao360.entity.Tehsil;
import com.unnao360.mapper.TehsilMapper;
import com.unnao360.repository.DistrictRepository;
import com.unnao360.repository.TehsilRepository;
@Service
public class TehsilServiceImpl implements TehsilService {
	private final TehsilRepository tehsilRepository;
	private final DistrictRepository districtRepository;
	public TehsilServiceImpl( TehsilRepository tehsilRepository,
			DistrictRepository districtRepository
			) {
		this.districtRepository=districtRepository;
		this.tehsilRepository=tehsilRepository;
	}
	

	@Override
	public Tehsil createTehsil(long ditrictId, Tehsil tehsil) {
		District district=districtRepository.findById(ditrictId).orElseThrow(()->new RuntimeException("District not found"));
		tehsil.setDistrict(district);
		
		return tehsilRepository.save(tehsil);
	}


	@Override
	public Page<TehsilDto> getTehsilByDistrict(long districtId,Pageable pageable) {
		
		return  tehsilRepository.findByDistrictId(districtId,pageable)
	            .map(TehsilMapper::toDto);
	}

	
}

package com.unnao360.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unnao360.dto.DistrictDto;
import com.unnao360.entity.District;
import com.unnao360.mapper.DistrictMapper;
import com.unnao360.repository.DistrictRepository;
@Service
public class DistrictServiceImpl implements DistrictService {
	private DistrictRepository districtRepository;
	public DistrictServiceImpl( DistrictRepository districtRepository)
	{
		this.districtRepository=districtRepository;
	}
	
	

	@Override
	public District createDistrict(District district) {
		
		return districtRepository.save(district);
	}

	@Override
	public List<DistrictDto> getAllDistrict() {
		 return districtRepository.findAll()
		            .stream()
		            .map(DistrictMapper::toDto)
		            .toList();
	}


}

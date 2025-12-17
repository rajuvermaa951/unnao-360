package com.unnao360.mapper;

import com.unnao360.dto.DistrictDto;
import com.unnao360.entity.District;

public class DistrictMapper {
	public static DistrictDto toDto(District district)
	{
		DistrictDto dto=new DistrictDto();
		dto.setId(district.getId());
		dto.setName(district.getName());
		dto.setState(district.getState());
		dto.setDescription(district.getDescription());
		return dto;
	}

}

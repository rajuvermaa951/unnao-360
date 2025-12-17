package com.unnao360.mapper;

import com.unnao360.dto.TehsilDto;
import com.unnao360.entity.Tehsil;

public class TehsilMapper {
	public static TehsilDto toDto(Tehsil tehsil)
	{
		TehsilDto dto=new TehsilDto();
		dto.setId(tehsil.getId());
		dto.setName(tehsil.getName());
		dto.setDistrictId(tehsil.getDistrict().getId());
		return dto;
	}

}

package com.unnao360.mapper;

import com.unnao360.dto.SchoolDto;
import com.unnao360.entity.School;


public class SchoolMapper {
	
	public static SchoolDto toDto(School school)
	{
		SchoolDto dto=new SchoolDto();
		dto.setId(school.getId());
		dto.setName(school.getName());
		dto.setType(school.getType());
		dto.setLevel(school.getLevel());
		dto.setVillageId(school.getVillage().getId());
		return dto;
		
	}

}

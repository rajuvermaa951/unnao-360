package com.unnao360.mapper;

import com.unnao360.dto.GovtOfficeDto;
import com.unnao360.entity.GovtOffice;

public class GovtOfficeMapper {
	public static GovtOfficeDto toDto(GovtOffice govtOffice)
	{
		GovtOfficeDto dto=new GovtOfficeDto();
		dto.setId(govtOffice.getId());
		dto.setName(govtOffice.getName());
		dto.setDepartment(govtOffice.getDepartment());
		dto.setVillageId(govtOffice.getVillage().getId());
		return dto;
	}

}

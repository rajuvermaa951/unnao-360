package com.unnao360.mapper;

import com.unnao360.dto.VillageDto;
import com.unnao360.entity.Village;

public class VillageMapper {
	public static VillageDto toDto(Village village)
	{
		VillageDto dto=new VillageDto();
		dto.setId(village.getId());
		dto.setName(village.getName());
		dto.setPopulation(village.getPopulation());
		dto.setBlockId(village.getBlock().getId());
		return dto;
	}

}

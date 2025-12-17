package com.unnao360.mapper;

import com.unnao360.dto.BlockDto;
import com.unnao360.entity.Block;

public class BlockMapper {
	public static BlockDto toDto(Block block)
	{
		BlockDto dto=new BlockDto();
		dto.setId(block.getId());
		dto.setName(block.getName());
		dto.setTehsilId(block.getTehsil().getId());
		return dto;
	}

}

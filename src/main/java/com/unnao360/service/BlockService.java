package com.unnao360.service;

import java.util.List;

import com.unnao360.dto.BlockDto;
import com.unnao360.entity.Block;

public interface BlockService {
	Block createBlock(long tehsilId,Block block);
	List<BlockDto> getBlocksByTehsil(long tehsilId);

}

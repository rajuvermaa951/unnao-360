package com.unnao360.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.unnao360.dto.BlockDto;
import com.unnao360.entity.Block;

public interface BlockService {
	Block createBlock(long tehsilId,Block block);
	Page<BlockDto> getBlocksByTehsil(long tehsilId,Pageable pageable);

}

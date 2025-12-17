package com.unnao360.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unnao360.dto.BlockDto;
import com.unnao360.entity.Block;
import com.unnao360.entity.Tehsil;
import com.unnao360.mapper.BlockMapper;
import com.unnao360.repository.BlockRepository;
import com.unnao360.repository.TehsilRepository;

@Service
public class BlockServiceImpl implements BlockService {
   private final BlockRepository blockRepository;
   private final TehsilRepository tehsilRepository;
	public BlockServiceImpl(BlockRepository blockRepository,
			TehsilRepository tehsilRepository)
	{
		this.blockRepository=blockRepository;
		this.tehsilRepository=tehsilRepository;
	}
	@Override
	public Block createBlock(long tehsilId, Block block) {
		Tehsil tehsil=tehsilRepository.findById(tehsilId).orElseThrow(()->new RuntimeException("Tehsil not found"));
		block.setTehsil(tehsil);
		return blockRepository.save(block);
	}

	@Override
	public List<BlockDto> getBlocksByTehsil(long tehsilId) {
		return blockRepository.findByTehsilId(tehsilId)
				.stream()
				.map(BlockMapper::toDto)
				.toList();
	}
	
	
	
	
	

}

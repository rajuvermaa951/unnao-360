package com.unnao360.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unnao360.dto.VillageDto;
import com.unnao360.entity.Block;
import com.unnao360.entity.Village;
import com.unnao360.mapper.VillageMapper;
import com.unnao360.repository.BlockRepository;
import com.unnao360.repository.VillageRepository;
@Service
public class VillageServiceImpl implements VillageService {
private final VillageRepository villageRepository;
private final BlockRepository blockRepository;
public VillageServiceImpl(VillageRepository villageRepository,
		                  BlockRepository blockRepository)
{
	this.blockRepository=blockRepository;
	this.villageRepository=villageRepository;
}
	@Override
	public Village createVillage(long blockId, Village village) {
		Block block=blockRepository.findById(blockId).orElseThrow(()->new RuntimeException("Block not found"));
		village.setBlock(block);
		
		return villageRepository.save(village);
	}

	@Override
	public List<VillageDto> getVillageByBlockId(long blockId) {
		return villageRepository.findByBlockId(blockId).stream().map(VillageMapper::toDto).toList();
	}

}

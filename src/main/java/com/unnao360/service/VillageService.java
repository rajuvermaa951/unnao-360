package com.unnao360.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.unnao360.dto.VillageDto;
import com.unnao360.entity.Village;

public interface VillageService {
Village createVillage(long blockId,Village village);
Page<VillageDto> getVillagesByBlockId(Long blockId, Pageable pageable);
}

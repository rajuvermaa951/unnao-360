package com.unnao360.service;

import java.util.List;

import com.unnao360.dto.VillageDto;
import com.unnao360.entity.Village;

public interface VillageService {
Village createVillage(long blockId,Village village);
List<VillageDto> getVillageByBlockId(long blockId);
}

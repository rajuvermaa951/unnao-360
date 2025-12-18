package com.unnao360.service;

import java.util.List;

import com.unnao360.dto.StatsDto;

public interface StatsService {
List<StatsDto> getVillageStats(long villageId);
List<StatsDto> getBlockStats(long blockId);
}

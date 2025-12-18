package com.unnao360.controller;


import com.unnao360.dto.StatsDto;
import com.unnao360.service.StatsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stats")
public class StatsController {

    private final StatsService service;

    public StatsController(StatsService service) {
        this.service = service;
    }

    @GetMapping("/village/{villageId}")
    public List<StatsDto> villageStats(@PathVariable Long villageId) {
        return service.getVillageStats(villageId);
    }

    @GetMapping("/block/{blockId}")
    public List<StatsDto> blockStats(@PathVariable Long blockId) {
        return service.getBlockStats(blockId);
    }
}

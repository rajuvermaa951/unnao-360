package com.unnao360.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unnao360.dto.VillageDto;
import com.unnao360.entity.Village;
import com.unnao360.service.VillageService;

@RestController
@RequestMapping("blocks/{blockId}/villages")
public class VillageController {
	private final VillageService villageService;
	public VillageController(VillageService villageService)
	{
		this.villageService=villageService;
	}
	
	@PostMapping
	public Village add(@PathVariable long blockId,
			@RequestBody Village village)
	{
		return villageService.createVillage(blockId, village);
	}
	@GetMapping
	public List<VillageDto> getAll(@PathVariable long blockId)
	{
		return villageService.getVillageByBlockId(blockId);
	}

}

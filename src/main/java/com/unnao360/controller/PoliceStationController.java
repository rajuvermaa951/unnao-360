package com.unnao360.controller;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unnao360.dto.PoliceStationDto;
import com.unnao360.entity.PoliceStation;
import com.unnao360.service.PoliceStationService;

@RestController
@RequestMapping("villages/{villageId}/police-stations")
public class PoliceStationController {
	
	private final PoliceStationService policeStationService;
	PoliceStationController(PoliceStationService policeStationService){
	this.policeStationService=policeStationService;
	}
	
	@PostMapping
	public PoliceStation add(@PathVariable long villageId,@RequestBody PoliceStation policeStation)
	{
		return policeStationService.createPoliceStation(villageId, policeStation);
	}
	
	@GetMapping
	public Page<PoliceStationDto> getAll(@PathVariable long villageId,
			                             @RequestParam(defaultValue="0")int page,
			                             @RequestParam(defaultValue="10")int size,
			                             @RequestParam(defaultValue="name")String sortBy
			
			){
		Pageable pageable=PageRequest.of(page, size,Sort.by(sortBy));
		return policeStationService.getPoliceStationsByVillage(villageId,pageable);
		
	}

}

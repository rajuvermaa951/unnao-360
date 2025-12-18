package com.unnao360.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unnao360.dto.GovtOfficeDto;
import com.unnao360.entity.GovtOffice;
import com.unnao360.service.GovtOfficeService;

@RestController
@RequestMapping("villages/{villageId}/govt-offices")
public class GovtOfficeController {

	private final GovtOfficeService govtOfficeService;
	GovtOfficeController(GovtOfficeService govtOfficeService)
	{
		this.govtOfficeService=govtOfficeService;
	}
	@PostMapping
	public GovtOffice add(@PathVariable long villageId,@RequestBody GovtOffice govtOffice)
	{
		return govtOfficeService.createGovtOffice(villageId, govtOffice);
	}
	@GetMapping
	public List<GovtOfficeDto> getAll(@PathVariable long villageId)
	{
		return govtOfficeService.getGovtOfficeByVillageId(villageId);
	}
}

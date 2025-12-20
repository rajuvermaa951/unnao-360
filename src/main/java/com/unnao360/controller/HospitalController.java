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

import com.unnao360.dto.HospitalDto;
import com.unnao360.entity.Hospital;
import com.unnao360.service.HospitalService;

@RestController
@RequestMapping("villages/{villageId}/hospitals")
public class HospitalController {
	private final HospitalService hospitalService;
	public HospitalController(HospitalService hospitalService)
	{
		this.hospitalService=hospitalService;
	}
	@PostMapping
	public Hospital add(@PathVariable long villageId,@RequestBody Hospital hospital)
	{
		return hospitalService.createHospital(villageId, hospital);
	}
@GetMapping
public Page<HospitalDto> getAll(@PathVariable long villageId,
		                        @RequestParam(defaultValue="0")int page,
		                        @RequestParam(defaultValue="10")int size,
		                        @RequestParam(defaultValue="name") String sortBy)
{
	Pageable pageable =PageRequest.of(page, size,Sort.by(sortBy));
	return hospitalService.getHospitalsByVillage(villageId,pageable);
}
}

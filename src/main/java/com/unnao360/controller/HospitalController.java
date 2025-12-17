package com.unnao360.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
public List<HospitalDto> getAll(@PathVariable long villageId)
{
	return hospitalService.getHospitalsByVillage(villageId);
}
}

package com.unnao360.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unnao360.dto.DistrictDto;
import com.unnao360.entity.District;
import com.unnao360.service.DistrictService;

@RestController
@RequestMapping("/districts")
public class DistrictController {
	
	private final  DistrictService districtService;
	public DistrictController(DistrictService districtService)
	{
		this.districtService=districtService;
	}
	@PostMapping
	public District add(@RequestBody District district)
	{
		return districtService.createDistrict(district);
	}
	@GetMapping
	public List<DistrictDto> getAll()
	{
		return districtService.getAllDistrict();
	}

}

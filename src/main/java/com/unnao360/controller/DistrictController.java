package com.unnao360.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unnao360.entity.District;
import com.unnao360.repository.DistrictRepository;

@RestController
@RequestMapping("/districts")
public class DistrictController {
	
	private final  DistrictRepository districtRepository;
	public DistrictController(DistrictRepository districtRepository)
	{
		this.districtRepository=districtRepository;
	}
	@PostMapping
	public District add(@RequestBody District district)
	{
		return districtRepository.save(district);
	}
	@GetMapping
	public List<District> getAll()
	{
		return districtRepository.findAll();
	}

}

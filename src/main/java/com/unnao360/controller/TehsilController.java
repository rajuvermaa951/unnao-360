package com.unnao360.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unnao360.dto.TehsilDto;
import com.unnao360.entity.Tehsil;
import com.unnao360.service.TehsilService;

@RestController
@RequestMapping("districts/{districtId}/tehsil")
public class TehsilController {
private final TehsilService tehsilService;
public TehsilController(TehsilService tehsilService)
{
	this.tehsilService=tehsilService;
}

@PostMapping
public Tehsil add(@PathVariable long districtId,
		@RequestBody Tehsil tehsil
		)
{
	return tehsilService.createTehsil(districtId, tehsil);
}
@GetMapping
public List<TehsilDto> getAll(@PathVariable long districtId)
{
	return tehsilService.getTehsilByDistrict(districtId);
}
}
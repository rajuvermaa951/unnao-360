package com.unnao360.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unnao360.dto.SchoolDto;
import com.unnao360.entity.School;
import com.unnao360.service.SchoolService;

@RestController
@RequestMapping("villages/{villageId}/schools")
public class SchoolController {
	private final SchoolService schoolService;
	public SchoolController(SchoolService schoolService)
	{
		this.schoolService=schoolService;
	}
@PostMapping
public School add(@PathVariable long villageId,@RequestBody School school)
{
	return schoolService.createSchool(villageId, school);
}
@GetMapping
public List<SchoolDto> getAll(@PathVariable long villageId)
{
	return schoolService.getSchoolsByVillage(villageId);
}
}

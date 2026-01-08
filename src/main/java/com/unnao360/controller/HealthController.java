package com.unnao360.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	@GetMapping("/api//health")
	public String health()
	{
		return "unnao 360 backend is running";
	}

}

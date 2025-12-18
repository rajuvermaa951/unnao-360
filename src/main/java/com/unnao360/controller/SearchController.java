package com.unnao360.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unnao360.dto.SearchResultDto;
import com.unnao360.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {
	private final SearchService searchService;
	public SearchController(SearchService searchService)
	{
		this.searchService=searchService;
	}
	@GetMapping
	public List<SearchResultDto> search(@RequestParam String name)
	{
		return searchService.searchByName(name);
	}

}

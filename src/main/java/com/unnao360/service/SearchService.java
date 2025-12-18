package com.unnao360.service;

import java.util.List;

import com.unnao360.dto.SearchResultDto;

public interface SearchService {
	List<SearchResultDto> searchByName(String keyword);

}

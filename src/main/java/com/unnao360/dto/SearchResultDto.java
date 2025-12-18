package com.unnao360.dto;

import lombok.Data;

@Data
public class SearchResultDto {
	private String type;
	private long id;
	private String name;
	private long villageId;
	private long blockId;
	private long tehsilId;
	private long districtId;

}

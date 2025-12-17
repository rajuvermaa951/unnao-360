package com.unnao360.dto;

import lombok.Data;

@Data
public class PoliceStationDto {
	private long id;
	private String name;
	private String contactNumber;
	private long villageId;

}

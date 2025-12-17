package com.unnao360.dto;

import lombok.Data;

@Data
public class HospitalDto {
	private long id;
	private String name;
	private String type;
	private boolean emergencyAvailable;
	private long villageId;
	

}

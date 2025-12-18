package com.unnao360.service;

import java.util.List;

import com.unnao360.dto.GovtOfficeDto;
import com.unnao360.entity.GovtOffice;

public interface GovtOfficeService {
	GovtOffice createGovtOffice(long villageId,GovtOffice govtOffice);
	List<GovtOfficeDto> getGovtOfficeByVillageId(long villageId);

}

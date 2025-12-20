package com.unnao360.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.unnao360.dto.GovtOfficeDto;
import com.unnao360.entity.GovtOffice;

public interface GovtOfficeService {
	GovtOffice createGovtOffice(long villageId,GovtOffice govtOffice);
	Page<GovtOfficeDto> getGovtOfficeByVillageId(long villageId,Pageable pageable);

}

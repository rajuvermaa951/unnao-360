package com.unnao360.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import com.unnao360.dto.TehsilDto;
import com.unnao360.entity.Tehsil;
import com.unnao360.service.TehsilService;

@RestController
@RequestMapping("/districts/{districtId}/tehsils")
public class TehsilController {

    private final TehsilService tehsilService;

    public TehsilController(TehsilService tehsilService) {
        this.tehsilService = tehsilService;
    }

    @PostMapping
    public Tehsil add(
            @PathVariable long districtId,
            @RequestBody Tehsil tehsil
    ) {
        return tehsilService.createTehsil(districtId, tehsil);
    }

    @GetMapping
    public Page<TehsilDto> getAll(
            @PathVariable long districtId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "name") String sortBy
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return tehsilService.getTehsilByDistrict(districtId, pageable);
    }
}

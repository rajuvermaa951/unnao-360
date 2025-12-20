package com.unnao360.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unnao360.dto.BlockDto;
import com.unnao360.entity.Block;
import com.unnao360.service.BlockService;

@RestController
@RequestMapping("tehsils/{tehsilId}/blocks")
public class BlockController {

	private final BlockService blockService;
	public BlockController(BlockService blockService)
	{
		this.blockService=blockService;
	}
	@PostMapping
	public Block add(@PathVariable long tehsilId,
			@RequestBody Block block)
	{
		return blockService.createBlock(tehsilId, block);
	}
	@GetMapping
	public Page<BlockDto> getAll(@PathVariable long tehsilId,
			                     @RequestParam(defaultValue="0")int page,
			                     @RequestParam(defaultValue="10")int size,
			                     @RequestParam(defaultValue="name")String sortBy
	)
	{
		Pageable pageable=PageRequest.of(page, size,Sort.by(sortBy));
		return blockService.getBlocksByTehsil(tehsilId,pageable);
	}
}

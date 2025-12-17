package com.unnao360.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.Block;

public interface BlockRepository extends JpaRepository<Block,Long> {
	List<Block> findByTehsilId(long tehsilId);

}

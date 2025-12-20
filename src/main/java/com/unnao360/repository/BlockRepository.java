package com.unnao360.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.unnao360.entity.Block;

public interface BlockRepository extends JpaRepository<Block,Long> {
	Page<Block> findByTehsilId(long tehsilId,Pageable pageable);

}

package com.eventkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventkart.entity.SellerDetails;

public interface SellerDetailsRepository extends JpaRepository<SellerDetails, Integer>{
 
	public SellerDetails findById(Integer id);
}

package com.eventkart.repository;

import javax.persistence.NamedQueries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventkart.entity.VendorDetails;

public interface VendorDetailsRepository extends JpaRepository<VendorDetails, Integer>{
 
	public VendorDetails findById(Integer id);
}

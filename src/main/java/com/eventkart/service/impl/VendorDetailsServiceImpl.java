package com.eventkart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventkart.entity.VendorDetails;
import com.eventkart.model.GenericResponse;
import com.eventkart.model.VendorRegisterRequest;
import com.eventkart.repository.VendorDetailsRepository;
import com.eventkart.service.VendorDetailsService;

@Service
@Transactional(rollbackFor=Exception.class)
public class VendorDetailsServiceImpl implements VendorDetailsService {

	@Autowired
	VendorDetailsRepository vendorDetailsRepository;

	@Override
	public GenericResponse addVendor(VendorRegisterRequest registerRequest) {

		VendorDetails vendorDetails = new VendorDetails();
		vendorDetails.setEnterpriseName(registerRequest.getEnterperiseName());
		vendorDetails.setVendorName(registerRequest.getVendorName());

		vendorDetailsRepository.save(vendorDetails);

		GenericResponse genericResponse = new GenericResponse();
		genericResponse.setCode(1000);
		genericResponse.setMessage("Successfully Registered");

		return genericResponse;
	}

}

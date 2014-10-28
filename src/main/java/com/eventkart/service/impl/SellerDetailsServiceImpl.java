package com.eventkart.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eventkart.endpoint.SellerController;
import com.eventkart.entity.SellerDetails;
import com.eventkart.exception.InvalidParameterException;
import com.eventkart.model.GenericResponse;
import com.eventkart.model.SellerRegisterRequest;
import com.eventkart.repository.SellerDetailsRepository;
import com.eventkart.service.SellerDetailsService;

@Service
@Transactional(rollbackFor = Exception.class)
public class SellerDetailsServiceImpl implements SellerDetailsService {

	@Autowired
	SellerDetailsRepository sellerDetailsRepository;
	private static final Logger logger = LoggerFactory.getLogger(SellerDetailsServiceImpl.class);

	@Override
	public GenericResponse addSeller(SellerRegisterRequest registerRequest) {

		SellerDetails vendorDetails = new SellerDetails();
		vendorDetails.setEnterpriseName(registerRequest.getEnterperiseName());
		vendorDetails.setVendorName(registerRequest.getVendorName());
		logger.debug("inside add seller {} ", System.currentTimeMillis());

		sellerDetailsRepository.save(vendorDetails);

		GenericResponse genericResponse = new GenericResponse();
		genericResponse.setCode(1000);
		genericResponse.setMessage("Successfully Registered");

		return genericResponse;
	}

	@Override
	public SellerRegisterRequest getSellerDetails(int sellerId) throws Exception {

		SellerDetails sellerDetails = sellerDetailsRepository.findById(sellerId);

		if (sellerDetails == null) {
			logger.warn("seller id does not exist : {}", sellerId);
			throw new InvalidParameterException("App Id does not exists");
		}

		SellerRegisterRequest registerRequest = new SellerRegisterRequest();
		registerRequest.setEnterperiseName(sellerDetails.getEnterpriseName());
		registerRequest.setVendorName(sellerDetails.getVendorName());

		return registerRequest;
	}

	@Override
	public GenericResponse updateSellerDetails(int sellerId, SellerRegisterRequest registerRequest) throws Exception {
		SellerDetails sellerDetails = sellerDetailsRepository.findById(sellerId);

		if (sellerDetails == null) {
			logger.warn("seller id does not exist : {}", sellerId);
			throw new InvalidParameterException("App Id does not exists");
		}

		sellerDetails.setEnterpriseName(registerRequest.getEnterperiseName());

		sellerDetailsRepository.save(sellerDetails);

		GenericResponse genericResponse = new GenericResponse();
		genericResponse.setCode(3000);
		genericResponse.setMessage("Successfully Updated");

		return genericResponse;
	}

	@Override
	public GenericResponse deleteSellerDetails(int sellerId) {
		// TODO Auto-generated method stub
		return null;
	}

}

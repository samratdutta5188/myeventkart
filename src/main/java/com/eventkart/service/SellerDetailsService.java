package com.eventkart.service;

import com.eventkart.model.GenericResponse;
import com.eventkart.model.SellerRegisterRequest;

public interface SellerDetailsService {

	public GenericResponse addSeller(SellerRegisterRequest registerRequest);
	public SellerRegisterRequest getSellerDetails(int sellerId) throws Exception;
	public GenericResponse updateSellerDetails(int sellerId,SellerRegisterRequest registerRequest) throws Exception;
	public GenericResponse deleteSellerDetails(int sellerId);
	
}

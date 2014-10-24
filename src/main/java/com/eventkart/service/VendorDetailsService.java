package com.eventkart.service;

import com.eventkart.model.GenericResponse;
import com.eventkart.model.VendorRegisterRequest;

public interface VendorDetailsService {

	public GenericResponse addVendor(VendorRegisterRequest registerRequest);
	
}

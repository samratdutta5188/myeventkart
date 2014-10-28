package com.eventkart.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eventkart.model.GenericResponse;
import com.eventkart.model.SellerRegisterRequest;
import com.eventkart.service.SellerDetailsService;

@Controller
public class SellerController {

	@Autowired
	private SellerDetailsService sellerDetailsService;

	private static final Logger logger = LoggerFactory.getLogger(SellerController.class);
	/**
	 * This is the controller to store seller details
	 * 
	 * @param registerRequest
	 * @return
	 */
	@RequestMapping(value = "v1/sellers", method = RequestMethod.POST)
	public @ResponseBody
	GenericResponse registerSellers(@RequestBody SellerRegisterRequest registerRequest) {

		long start = System.currentTimeMillis();

		logger.info("Entering registerVendor {}", start);
		logger.debug("Request object {}", registerRequest.toString());

		logger.info("Exiting registerVendor {}", System.currentTimeMillis());
		return sellerDetailsService.addSeller(registerRequest);

	}

	/**
	 * This controller is used to get seller details.
	 * @param sellerId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/v1/{sellerId}/sellers", method = RequestMethod.GET)
	public @ResponseBody
	SellerRegisterRequest getSellerDetails(@PathVariable int sellerId) throws Exception {

		long start = System.currentTimeMillis();

		logger.info("Entering getSellerDetails {}", start);
		logger.debug("Request object {}", sellerId);

		logger.info("Exiting getSellerDetails {}", System.currentTimeMillis());
		return sellerDetailsService.getSellerDetails(sellerId);

	}

	/**
	 * This method is used to update seller details.
	 * @param sellerId
	 * @param registerRequest
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/v1/{sellerId}/sellers", method = RequestMethod.PUT)
	public @ResponseBody
	GenericResponse updateSellerDetails(@PathVariable int sellerId, @RequestBody SellerRegisterRequest registerRequest)
			throws Exception {

		long start = System.currentTimeMillis();

		logger.info("Entering getSellerDetails {}", start);
		logger.debug("Request object {}", sellerId);

		logger.info("Exiting getSellerDetails {}", System.currentTimeMillis());
		return sellerDetailsService.updateSellerDetails(sellerId, registerRequest);

	}
}

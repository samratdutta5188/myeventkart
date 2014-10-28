package com.eventkart.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class HashUtil {

	private static final Logger logger = LoggerFactory.getLogger(HashUtil.class);

	public static String hashPassword(String password) {
		BCryptPasswordEncoder encoder = new  BCryptPasswordEncoder(11);
		
		return encoder.encode("password");
	}
}

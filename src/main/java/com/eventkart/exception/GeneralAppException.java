package com.eventkart.exception;

import org.hamcrest.core.IsInstanceOf;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eventkart.model.GenericResponse;

@ControllerAdvice
public class GeneralAppException {

	@ExceptionHandler(Exception.class)
	public @ResponseBody
	GenericResponse exception(Exception ex) {

		GenericResponse genericResponse = new GenericResponse();
		if (ex instanceof InvalidParameterException) {

			genericResponse.setCode(2000);
			genericResponse.setMessage(ex.getMessage());

		}
		return genericResponse;
	}
}

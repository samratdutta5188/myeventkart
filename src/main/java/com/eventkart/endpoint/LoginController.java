package com.eventkart.endpoint;

import javax.xml.ws.RequestWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eventkart.model.GenericResponse;
import com.eventkart.model.VendorRegisterRequest;
import com.eventkart.service.VendorDetailsService;
import com.google.gson.Gson;

@Controller
public class LoginController {
	
}
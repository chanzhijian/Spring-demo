package com.csair.ndc.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csair.ndc.model.Acknowledgement.AircraftCode;



@RestController
public class TestController {

	private static final Logger logger = LoggerFactory
			.getLogger(TestController.class);
	
	
	@RequestMapping(value = "/consumer", method = RequestMethod.POST)
	public String testController() {
		logger.info("controller begin");

		return "OK";
	}
	
	

}

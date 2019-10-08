package com.visitmehere.limits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visitmehere.Configuration;



@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimits() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}

}

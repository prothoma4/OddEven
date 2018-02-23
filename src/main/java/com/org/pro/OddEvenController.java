package com.org.pro;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OddEvenController {
	
	private Logger logger=Logger.getLogger(OddEvenController.class);
	
	@RequestMapping(method=RequestMethod.GET,path="oddeven",produces="application/json")
	public String findOddEven(@RequestParam(value="number") int number) {
		logger.info("Inside the odd even method");
		
		if(number%2==0)
			return "EVEN";
		else
			return "ODD";
	}
}

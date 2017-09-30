package com.EasyRentalsBackup.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/EasyRentals/cellNum")
public class CellNumController {

	@RequestMapping(method=RequestMethod.GET)
	public String cellNumber(
			 @RequestParam(value="mode", required=false, defaultValue="text") String mode,
			    @RequestParam(value="number", required=true) String number, Model model) {
			    model.addAttribute("number", number);
			    model.addAttribute("mode", mode);
			 
			   /* if(mode.equalsIgnoreCase("text")){
			        sendSMS(number);
			    }
			    else if (mode.equalsIgnoreCase("call")) {
			        makeCall(number);
			    }
			    return "greeting";*/
			    return null;
	}
}

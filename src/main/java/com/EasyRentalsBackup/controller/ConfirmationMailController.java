package com.EasyRentalsBackup.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.EasyRentalsBackup.model.User;
import com.EasyRentalsBackup.service.SignupConformationMail;

@RestController
@RequestMapping("/EasyRentals/mail")
public class ConfirmationMailController {

	private org.slf4j.Logger logger= LoggerFactory.getLogger(ConfirmationMailController.class);
	
	@Autowired
	SignupConformationMail signupConformationmail;
	
	@RequestMapping(value="/send", method= RequestMethod.POST)
	public void signupMail(@RequestBody User user)
	{
		try
		{
			
		signupConformationmail.sendNotification(user);
		logger.info("Success");
		}
		catch(MailException e)
		{
			logger.info("Error Sending Email     "+e.getMessage());
		}
		//return "Thank you for registering with us";
	}
}

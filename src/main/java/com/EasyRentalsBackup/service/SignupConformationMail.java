package com.EasyRentalsBackup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.EasyRentalsBackup.model.User;

@Service
public class SignupConformationMail {

	/* private final Long userId;

	    private final String UserEmail;

	    private final String customerName;

		private Long UserId;
	
	   public BookingConfirmationMail(User user) {
	        //this.confirmationCode = booking.getConfirmationCode();
	        this.userId = user.getId();
	        this.customerEmail = user.getEmail();
	        this.customerName = user.getfName();
	        
	        //this.trainingName = booking.getTraining().getName();
	        //this.trainingDate = booking.getTraining().getDate();
	        //this.applicationUrl = applicationUrl;
	    }
	
	 public SimpleMailMessage simpleMailMessage() {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(customerEmail);
	        message.setSubject(subject());
	        message.setText(text());

	        return message;
	    }
	 
	 private String subject() {
	        return "Booking confirmation from EasyRentals";
	    }
	 
	  private String text() {
	        return "Hi " + customerName + "!"
	                + "\n"
	                + "\n"
	                + "To confirm your booking, click the following link:"
	                + "\n"
	                + "\n"
	                + "http://" + applicationUrl + "/v1/bookings/" + bookingId + "/confirmation?code="
	                + confirmationCode.toString()
	                + "\n"
	                + "\n"
	                + "Regards.";
	    }*/
	
	/*private String UserEmail;
	
	private String UserName;
	
	 @Autowired
	 
	     private JavaMailSender sender;
	 @Autowired 
	 private UserRepository userRepository;
	 
	  //String userName= user.getfName();
	  
	  //String userEmail=user.getEmail();
	 
	     @RequestMapping(value="/simpleEmail", method=RequestMethod.POST)
	     @ResponseBody String home(@RequestBody User user ) {
	 
	    	 User u1=userRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
	    	 this.UserEmail= u1.getEmail();
	    	 this.UserName= u1.getfName();
	         try {
	 
	             sendEmail();
	 
	             return "Email Sent!";
	 
	         }catch(Exception ex) {
	 
	             return "Error in sending email: "+ex;
	 
	         }
	 
	     }
	 
	  
	 
	     private void sendEmail() throws Exception{
	 
	         MimeMessage message = sender.createMimeMessage();
	 
	         MimeMessageHelper helper = new MimeMessageHelper(message);
	 
	          
	 
	         helper.setTo(UserEmail);
	 
	         helper.setText("Hello" +UserName
	         		+ "Thank you for signing up");
	 
	         helper.setSubject("Signup confirmation");
	
	          
	
	         sender.send(message);
	  
	     }
*/
	
	private JavaMailSender javaMailSender;
	
	@Autowired
	public SignupConformationMail(JavaMailSender javaMailSender)
	{
		this.javaMailSender= javaMailSender;
}
	public void sendNotification(User user) throws MailException
	{
		SimpleMailMessage mail= new SimpleMailMessage();
		mail.setTo(user.getEmail());
		mail.setFrom("support@foodnearu.com");
		mail.setSubject("Conformation mail From Easy Rentals");
		mail.setText("Hello "+user.getfName()+"\nThank you for signing up at Easy Rentals");
	javaMailSender.send(mail);
	}
}

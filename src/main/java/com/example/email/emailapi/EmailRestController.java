package com.example.email.emailapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailRestController {
	@Autowired
    private JavaMailSender javaMailSender;
	
	@Autowired
	EmailRepository emailRepository;
	
	Email emailbody;
	
	@GetMapping("/")
	public String hello() {
		return "HelloWorld";
	}
	
	@PostMapping(path = "/sendmail", consumes = "application/json")
	public String getEmailInfo(@RequestBody Email email) {
		emailbody = email; 
		String str = "from: "+email.getEmail_from()+" to: "+email.getEmail_to()+" subject:"+email.getSubject()+" body:" + email.getBody();
		emailRepository.save(emailbody);
		sendEmail(emailbody);
		return str;
	}
	
	void sendEmail(Email emailbody) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom(emailbody.email_from);
        msg.setTo(emailbody.email_to);

        msg.setSubject(emailbody.subject);
        msg.setText(emailbody.body);

        javaMailSender.send(msg);

    }
}

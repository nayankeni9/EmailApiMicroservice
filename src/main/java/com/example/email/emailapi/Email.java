package com.example.email.emailapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "email_info")
public class Email {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	String email_from;
	String email_to;
	String subject;
	String body;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail_from() {
		return email_from;
	}
	public void setEmail_from(String email_from) {
		this.email_from = email_from;
	}
	public String getEmail_to() {
		return email_to;
	}
	public void setEmail_to(String email_to) {
		this.email_to = email_to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	
	
}

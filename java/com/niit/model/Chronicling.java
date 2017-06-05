package com.niit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Table
@Entity 
public class Chronicling implements Serializable 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column(unique=true)
	@Pattern(regexp=".+@.+\\..+", message="Invalid email!")
	private String Onlinemail;
	@Size(min=5, max=10, message="your name should be between 5-10 characters.")
	private String name;
	@NotNull(message="should not be empty")
	@Size(min=5, max=10, message="Password should be between 5-10 characters")
	private String secretword;
	@Size(min=10, message="you cannot entered less than 10 digits.")
	private String contactno;
	private String role;
	
	private boolean is_active;
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getOnlinemail() {
		return Onlinemail;
	}
	public void setOnlinemail(String onlinemail) {
		Onlinemail = onlinemail;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecretword() {
		return secretword;
	}
	public void setSecretword(String secretword) {
		this.secretword = secretword;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}	
}
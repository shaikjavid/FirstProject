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

import org.hibernate.validator.constraints.Length;

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
	private String username;
	@NotNull(message="should not be empty")
	@Length(min=5, max=10, message="Password should be between 5-10 characters")
	private String secretword;
	@Size(min=10, message="you cannot entered less than 10 digits.")
	private String contactno;
	private String role;
	public String getRole() {
		return role;
	}
	public void getRole(String role) {
		this.role=role;
	}
	
	public void setRole(String role) {
		this.role=role;
		
	}
	public boolean isIs_Active() {
		return is_Active;
	}
	public void setIs_Active(boolean is_Active) {
		this.is_Active=is_Active;
	}
	private boolean is_Active;
	private String OnlineMail;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid=userid;
	}
	public String getOnlineMail() {
		
		return OnlineMail;
	}

	public void setOnlineMail(String OnlineMail) {
		this.OnlineMail=OnlineMail;
	}
	public String getUSername() {
		return username;
	}
	public void setUSername(String username) {
		this.username=username;
	}
	public String getSecretword() {
		return secretword;
	}
	public void setSecretword(String secretword) {
		this.secretword=secretword;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String Contactno) {
		this.contactno=Contactno;
	}
}

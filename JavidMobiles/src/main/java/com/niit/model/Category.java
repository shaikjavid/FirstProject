package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Category
{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int categoryid;
	
	@NotNull(message="cannot be blank")
	@Size(min=5, max=20,message="min 5 characters and max should not exceed 20 char")
	private String catname;

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String catname) {
		this.catname = catname;
	}
	
	
	
	
	

}

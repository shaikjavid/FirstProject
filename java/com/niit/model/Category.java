package com.niit.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category
{
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product=product;
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int categoryid;
	
	@NotNull(message="cannot be blank")
	@Size(min=5, max=20,message="take from 5 to 20 data")
	private String catname;
	
	@JsonIgnore
	@OneToMany(mappedBy="category",fetch=FetchType.EAGER)
	private Set<Product> product=new HashSet<Product>();

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

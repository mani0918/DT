package com.niit.shoppingcart.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity // to map to data base table
@Table(name = "User") // if the table name and domain class name is different
@Component   //context.scan("com.niit") will scan the package and create instance
public class User {

	@Id
	private String id;
	@Column(name = "name")
	private String name;
	private String password;
	private String role;
	

    private int contact;


	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}

}

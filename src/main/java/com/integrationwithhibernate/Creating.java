package com.integrationwithhibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "E1")
public class Creating {
	@Id
	private String firstname;
	@Column(name = "LN")
	private String Lastname;
	@Column(name = "email")
	private String email;

	public Creating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Creating(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		Lastname = lastname;
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Creating [firstname=" + firstname + ", Lastname=" + Lastname + ", email=" + email + "]";
	}

}

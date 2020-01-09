package com.example.trial.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="user table")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(value="Id ")
	private Integer Id;	

	@ApiModelProperty(value="Name ")
	private String Name;
	
	@ApiModelProperty(value="Email ")
	private String Email;
	
	@ApiModelProperty(value="Address ")
	private String Address;

	@ApiModelProperty(value="Phone ")
	private String Phone;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String Phone) {
		this.Phone = Phone;
	}

}

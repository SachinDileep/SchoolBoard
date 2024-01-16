package com.school.sba.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class User {

	private int UserId;
	
	@Column(unique = true)
	private String userName;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private long contactNo;
	
	@Column(unique = true)
	private String email;
	
	private enum UserRole{ADMIN,TEACHER,STUDENT};
}

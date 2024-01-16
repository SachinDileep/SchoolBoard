package com.school.sba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.school.sba.service.SchoolService;

@Controller
public class SchoolController 
{
	
	@Autowired
	private SchoolService service;
	
	public String saveDataSchool(int schoolId,String schoolName,long schoolContactNo,String email,String address) {
		
		return null;
	}

}

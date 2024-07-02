package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@RestController
public class HomeController {
	@Autowired HomeService hs;
	@PostMapping("/savedata")
	public ResponseEntity<Student> saveStudent(@RequestBody Student stu)
	{
		 Student s=hs.saveData(stu);
		return new  ResponseEntity<Student>(s, HttpStatus.CREATED);
	}

}

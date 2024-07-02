package com.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
 @Autowired HomeRepository hr;
	@Override
	public Student saveData(Student stu) {
		Student st = hr.save(stu);
		return st;
	}

}

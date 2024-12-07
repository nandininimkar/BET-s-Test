package com.sbcrud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbcrud.model.Course;
import com.sbcrud.repository.CourseRepository;
import com.sbcrud.servicei.ServiceI;

@Service
public class ServiceImplement implements ServiceI{

	@Autowired
	 CourseRepository cr;
	
	@Override
	public void saveCourse(Course c) {
		
		cr.save(c);
	}

	@Override
	public Iterable<Course> getAllCourse() {
		
		return cr.findAll();
	}

	@Override
	public Course editCourse(int id) {
		
		return cr.findByID(id);
	}

	@Override
	public void deleteCourse(Course c) {
		
		cr.delete(c);
	}

	
}

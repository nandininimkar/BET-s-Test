package com.sbcrud.servicei;

import com.sbcrud.model.Course;


public interface ServiceI {

	public void saveCourse(Course c);

	public Iterable<Course> getAllCourse();
	
	public Course editCourse(int id);

	public void deleteCourse(Course c);
	
}

package com.sbcrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sbcrud.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course,Integer>{

	public Course findByID(int id);
}

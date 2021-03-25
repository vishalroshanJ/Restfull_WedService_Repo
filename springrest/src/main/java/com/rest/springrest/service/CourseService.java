package com.rest.springrest.service;

import java.util.List;

import com.rest.springrest.model.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long c_id);
	public Course addCourse(Course cr);
	public Course updateCourse(Course cr);
	public void deleteCourse(long c_id);
}

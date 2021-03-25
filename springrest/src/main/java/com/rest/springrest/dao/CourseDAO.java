package com.rest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.springrest.model.Course;

public interface CourseDAO extends JpaRepository<Course, Long> {

}

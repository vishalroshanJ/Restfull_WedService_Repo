package com.rest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springrest.model.Course;
import com.rest.springrest.service.CourseService;

@RestController
public class MyController {

	@Autowired
	CourseService cs;
	
	//GET-all
	@GetMapping("/course")
	public List<Course> getCourses()
	{
		return cs.getCourses();
		
	}
	
	//GET-by id
	@GetMapping("/course/{c_id}")
	public Course getCourse(@PathVariable long c_id)
	{
		return cs.getCourse(c_id) ;
		
	}
	
	//POST-add course
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course cr)
	{
		return cs.addCourse(cr);
		
	}
	
	//PUT-updating
	@PutMapping("/course")
	public Course updateCourse(@PathVariable Course cr )
	{
		return cs.updateCourse(cr);
		
	}
	//DELETE
	@DeleteMapping("/course/{c_id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable Long c_id)
	{
		try {
		      cs.deleteCourse(c_id);
		      return new ResponseEntity<>(HttpStatus.OK);
		      
		}
		catch(Exception e){
			 
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
		
	}
}

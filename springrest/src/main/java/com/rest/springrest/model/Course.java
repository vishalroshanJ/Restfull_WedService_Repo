package com.rest.springrest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	private long c_id;
	private String c_name;
	private String c_desc;
	public Course(long c_id, String c_name, String c_desc) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_desc = c_desc;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getC_id() {
		return c_id;
	}
	public void setC_id(long c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_desc() {
		return c_desc;
	}
	public void setC_desc(String c_desc) {
		this.c_desc = c_desc;
	}
	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", c_desc=" + c_desc + "]";
	}
	
	
}

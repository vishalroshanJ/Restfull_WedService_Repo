package com.ltts.deatilokay.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class PlayerClass {
	private  int id;
	private String name;
	private String nationality;
	private int Teamid;
	public PlayerClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerClass(int id, String name, String nationality, int teamid) {
		super();
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		Teamid = teamid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getTeamid() {
		return Teamid;
	}
	public void setTeam(int teamid) {
		Teamid = teamid;
	}
	@Override
	public String toString() {
		return "PlayerClass [id=" + id + ", name=" + name + ", nationality=" + nationality + ", Teamid=" + Teamid + "]";
	}
}

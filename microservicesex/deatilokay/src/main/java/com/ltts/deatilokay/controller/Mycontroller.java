package com.ltts.deatilokay.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ltts.deatilokay.model.PlayerClass;
import com.ltts.deatilokay.model.Team;

@RestController
public class Mycontroller {
	@Autowired
	RestTemplate rt;
	
	@RequestMapping("/welcome")
    public String wel()
    {
    	return "welcome";
    }
	
	@GetMapping("/detail")
	public List<Team> getTeam()
	{
		ResponseEntity<Team[]> response = rt.getForEntity("http://localhost:8086/products",Team[].class);
				Team[] teams = response.getBody();
				List<Team> lt=Arrays.asList(teams);
				return lt;
	}
	
	@GetMapping("/players")
	public List<PlayerClass> getplayers()
	{
		ResponseEntity<PlayerClass[]> response = rt.getForEntity("http://localhost:8087/players",PlayerClass[].class);
		PlayerClass[] teams = response.getBody();
				List<PlayerClass> lt=Arrays.asList(teams);
				return lt;
	}
	
	
	
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
	    return "Hello " + name;
	}

}


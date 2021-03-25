package com.ltts.playersmicroservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.playersmicroservices.Dao.PlayerDaoClass;
import com.ltts.playersmicroservices.Model.PlayerClass;
@RestController
public class PlayerController {
	 @Autowired
		PlayerDaoClass productser;
		 @GetMapping("/players")
		 public List<PlayerClass> getALLProducts()
		 {
			 return productser.getproduct();
		 }

}

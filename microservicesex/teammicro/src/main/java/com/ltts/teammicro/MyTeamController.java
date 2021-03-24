package com.ltts.teammicro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyTeamController {
	 @Autowired
	TeamDao productser;
	 @GetMapping("/products")
	 public List<Team> getALLProducts()
	 {
		 return productser.getproduct();
	 }
	 
}

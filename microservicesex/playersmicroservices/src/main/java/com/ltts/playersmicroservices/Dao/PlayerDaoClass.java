package com.ltts.playersmicroservices.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ltts.playersmicroservices.Model.PlayerClass;

@Service
public class PlayerDaoClass {

	public List<PlayerClass> getproduct(){
		List<PlayerClass> listofproducts=new ArrayList<>();
		listofproducts.add(new PlayerClass(123,"Vishal","Indian",1)) ;
		listofproducts.add(new PlayerClass(124,"Maxwell","Australia",2)) ;
		listofproducts.add(new PlayerClass(125,"ABdvillers","South Africa",3)) ;
		return listofproducts;
	}
	
	
	
	
}

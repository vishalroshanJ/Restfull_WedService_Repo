package com.ltts.teammicro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TeamDao {

	public List<Team> getproduct(){
		List<Team> listofproducts=new ArrayList<>();
		listofproducts.add(new Team(123,"iphone","wer")) ;
		listofproducts.add(new Team(124,"iphone_x","wert")) ;
		listofproducts.add(new Team(125,"iphone_XI","wert")) ;
		return listofproducts;
	}
	
	
}

package com.rest.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.rest.model.Product;
@Service
public class ProductDao {

	public List<Product> getproduct(){
		List<Product> listofproducts=new ArrayList<>();
		listofproducts.add(new Product("123","iphone")) ;
		listofproducts.add(new Product("124","iphone_x")) ;
		listofproducts.add(new Product("125","iphone_XI")) ;
		return listofproducts;
	}
	public Product getProductByid(String id)
	{
		Predicate<Product> byId= p->p.getId().equals(id);
		return filterProducts(byId);
	}
	
	
	private Product filterProducts(Predicate<Product> strategy)
	{
		return getproduct().stream().filter(strategy).findFirst().orElse(null);
	}
	
	public Product addproduct(Product newproduct)
	{newproduct.setId("126");
	return newproduct;
	}	
}

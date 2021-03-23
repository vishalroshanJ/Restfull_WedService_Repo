package com.rest.spring.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.rest.spring.controller.ProductDao;
import com.rest.model.Product;


@RestController
public class MyController {

	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
	    return "Hello " + name;
	}
//	@GetMapping("/getproduct")
//	public Product getProductd() {
//	    return new Product("1", "iPhone");
//	}
//	
//	private static Map<String, Product> productRepo = new HashMap<>();
//	   static {
//	      Product honey = new Product();
//	      honey.setId("1");
//	      honey.setName("Honey");
//	      productRepo.put(honey.getId(), honey);
//	      
//	      Product almond = new Product();
//	      almond.setId("2");
//	      almond.setName("Almond");
//	      productRepo.put(almond.getId(), almond);
//	   }
//	   
//	   @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
//	   public ResponseEntity<Object> delete(@PathVariable("id") String id) { 
//	      productRepo.remove(id);
//	      return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
//	   }
//	   
//	   @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
//	   public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) { 
//	      productRepo.remove(id);
//	      product.setId(id);
//	      productRepo.put(id, product);
//	      return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
//	   }
//	   
//	   @RequestMapping(value = "/products", method = RequestMethod.POST)
//	   public ResponseEntity<Object> createProduct(@RequestBody Product product) {
//	      productRepo.put(product.getId(), product);
//	      return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
//	   }
//	   
//	   @RequestMapping(value = "/products")
//	   public ResponseEntity<Object> getProduct() {
//	      return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
//	   }
    @Autowired
	ProductDao productser;
	
    @GetMapping("/products")
 public List<Product> getALLProducts()
 {
	 return productser.getproduct();
 }
 
   @GetMapping("/products/{id}")
 public ResponseEntity<Product> getProductById(@PathVariable("id") String productId){
	Product pro =productser.getProductByid(productId);
	if(pro==null) {
	 return new ResponseEntity<Product> (pro,HttpStatus.NOT_FOUND);
	}
	 return new ResponseEntity<Product> (pro,HttpStatus.OK);
	 
 }	 
}

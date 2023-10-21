package com.cjc.Springbootrestapicrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.Springbootrestapicrudapp.model.Product;
import com.cjc.Springbootrestapicrudapp.servicei.ProductserviceI;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class Productcontroller 
{
	@Autowired
	ProductserviceI psi;
	
	//http://localhost:9999/api/product
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product p )
	{
		return psi.saveProduct(p);
	}
	@GetMapping("/products")
	public List<Product>getProducts(){
		return psi.getProducts();
		
	}
	@PutMapping("/product/{id}")
	public Product updateProduct(@PathVariable int id,@RequestBody Product p)
	{
		return psi.updateProduct(id,p);
		
	}
	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		 psi.deleteProduct(id);
		 return "deleted";
		
	}
	

}

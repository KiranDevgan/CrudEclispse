package com.cjc.springbootrestwslambokcrud.app.controller;

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

import com.cjc.springbootrestwslambokcrud.app.model.Product;
import com.cjc.springbootrestwslambokcrud.app.servicei.ProductServiceI;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductServiceI psi;

	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product p) {
		
		return psi.saveProduct(p);
	}
	
	@GetMapping("/products")
	public List<Product> getProduct(){
		
		return psi.getProducts();
	}
	
	@PutMapping("/product/{productid}")
	public Product updateProduct(@PathVariable int productid, @RequestBody Product p)
	{
		return psi.updateProduct(productid,p);
	}
	
	@DeleteMapping("/product/{productid}")
	public String deleteProduct(@PathVariable int productid)
	{
		psi.deleteProduct(productid);
		return "deleted..!";
		
	}
}

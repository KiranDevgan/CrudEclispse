package com.cjc.Springbootrestapicrudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cjc.Springbootrestapicrudapp.model.Product;

@SpringBootApplication
public class SpringbootrestapicrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestapicrudappApplication.class, args);
		Product p=new Product(1,"kiran",3250);
	
		
		System.out.println(p);
	}

}

package com.cjc.Springbootrestapicrudapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.Springbootrestapicrudapp.model.Product;
import com.cjc.Springbootrestapicrudapp.respositary.ProductRespositary;
import com.cjc.Springbootrestapicrudapp.servicei.ProductserviceI;
@Service
public class ProductserviceImpl implements ProductserviceI
{
	@Autowired
	ProductRespositary pr;

	@Override
	public Product saveProduct(Product p) {
		
		return pr.save(p);
	}

	@Override
	public List<Product> getProducts() {
		
		return pr.findAll();
	}

	@Override
	public Product updateProduct(int id, Product p) {
		
		return null;
	}

	@Override
	public String deleteProduct(int id) {
	
		return pr.deleteByid(id);
	}

}

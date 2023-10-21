package com.cjc.springbootrestwslambokcrud.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springbootrestwslambokcrud.app.model.Product;
import com.cjc.springbootrestwslambokcrud.app.repository.ProductReppository;
import com.cjc.springbootrestwslambokcrud.app.servicei.ProductServiceI;
@Service
public class ProductServiceImpl implements ProductServiceI{

	@Autowired
	ProductReppository pri;
	
	@Override
	public Product saveProduct(Product p) {
		
		
		return pri.save(p);
	}

	@Override
	public List<Product> getProducts() {
		
		return pri.findAll();
	}

	@Override
	public Product updateProduct(int productid,Product p) {
	
		Optional<Product> op = pri.findById(productid);
		
		if(op.isPresent()) {
			Product product=op.get();
			
			product.setProductname(p.getProductname());
			product.setDescription(p.getDescription());
		 return	pri.save(product);	
		}
		else
			return null;
	}

	@Override
	public void deleteProduct(int productid) {
		
		pri.deleteById(productid);
		
	}

}

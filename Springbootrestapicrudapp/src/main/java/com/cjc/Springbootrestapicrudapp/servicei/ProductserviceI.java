package com.cjc.Springbootrestapicrudapp.servicei;

import java.util.List;

import com.cjc.Springbootrestapicrudapp.model.Product;

public interface ProductserviceI {

	public Product saveProduct(Product p);

	public List<Product> getProducts();

	public Product updateProduct(int id, Product p);

	public String deleteProduct(int id);

}

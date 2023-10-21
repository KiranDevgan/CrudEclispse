package com.cjc.springbootrestwslambokcrud.app.servicei;

import java.util.List;

import com.cjc.springbootrestwslambokcrud.app.model.Product;

public interface ProductServiceI {

	public Product saveProduct(Product p);

	public List<Product> getProducts();

	public Product updateProduct(int productId, Product p);

	public void deleteProduct(int productid);

}

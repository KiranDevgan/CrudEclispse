package com.cjc.Springbootrestapicrudapp.respositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.Springbootrestapicrudapp.model.Product;


public interface ProductRespositary extends JpaRepository<Product, Integer>{

	public String deleteByid(int productId);

}

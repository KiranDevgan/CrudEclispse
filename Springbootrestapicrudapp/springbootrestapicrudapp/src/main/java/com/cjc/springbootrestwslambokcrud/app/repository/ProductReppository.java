package com.cjc.springbootrestwslambokcrud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.springbootrestwslambokcrud.app.model.Product;

@Repository
public interface ProductReppository extends JpaRepository<Product, Integer>{

}

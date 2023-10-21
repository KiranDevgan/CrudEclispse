package com.cjc.springbootrestwslambokcrud.app.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.tool.schema.internal.exec.GenerationTarget;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product implements Serializable
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productid;
	private String productname;
	private String description;

	
}

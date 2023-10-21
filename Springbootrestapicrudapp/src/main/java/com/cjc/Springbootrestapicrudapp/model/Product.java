package com.cjc.Springbootrestapicrudapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable 
{
	@Id
 private  int id;
 private String ProductName;
 private double productPrice;
}

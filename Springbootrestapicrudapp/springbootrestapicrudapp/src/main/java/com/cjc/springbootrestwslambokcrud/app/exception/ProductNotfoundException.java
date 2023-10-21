package com.cjc.springbootrestwslambokcrud.app.exception;

public class ProductNotfoundException extends RuntimeException {
	
	public ProductNotfoundException(String msg)
	{
		super (msg);
	}

}

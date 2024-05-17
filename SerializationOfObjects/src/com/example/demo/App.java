package com.example.demo;

import java.io.Serializable;

public class App implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int number;
	private String value;
	private transient String data;
	
	public App(int number, String value, String data) {
		this.number = number;
		this.value = value;
		this.data = data;
	}

	@Override
	public String toString() {
		return "App [number=" + number + ", value=" + value + "]";
	}
	





	
	

}

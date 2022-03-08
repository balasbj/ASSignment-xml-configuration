package com.tcs.Assignment;

import org.springframework.stereotype.Component;

@Component
public class Car {
	private String brand;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String brand, Color color, Tyre tyre) {
		super();
		this.brand = brand;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
	}

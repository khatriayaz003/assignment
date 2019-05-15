package com.assignment.speedrent.vo;

public class Car {

	private String name;
	private String manufacturer;
	
	public Car() {
		
	}
	
	public Car(String name,String manufacturer) {
		this.name=name;
		this.manufacturer=manufacturer;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	public String toString(){
		return "name : "+name+" manufacturer: "+manufacturer;
	}
	
	
	
	
	
}

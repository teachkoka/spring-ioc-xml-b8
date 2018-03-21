package com.batch8.ioc.xml;

public class LaptopDetails {
	
	private String name;
	private String brand;
	private double cost;
	private int count;

	public LaptopDetails(){
		
	}
	public LaptopDetails(String name, String brand, double cost, int count) {
		super();
		this.name = name;
		this.brand = brand;
		this.cost = cost;
		this.count = count;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "LaptopDetails [name=" + name + ", brand=" + brand + ", cost="
				+ cost + ", count=" + count + "]";
	}
	
	
	

}

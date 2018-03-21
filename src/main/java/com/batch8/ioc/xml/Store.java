package com.batch8.ioc.xml;

public class Store {
	
	Payments pymnt;
	Items items;
	
	public Store(Payments pymnt, Items items) {
		this.pymnt = pymnt;
		this.items = items;
		System.out.println("2 Arg Store class called");
	}
	
	
	public Store(Payments pymnt) {
		this.pymnt = pymnt;
		System.out.println("Single arg Store class called");
	}


	public void setItems(Items items) {
		System.out.println("Setter called....");
		this.items = items;
	}
	
	

}

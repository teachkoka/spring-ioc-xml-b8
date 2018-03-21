package com.bacth8.ioc.pets;

public class ItemsService {
	
	private ItemsService(){
		System.out.println("I'm inside private");
	}
	public void itemsLogic(){
		System.out.println("inside ItemsSerivce");
	}

	public ItemsService getInstance(){
		return new ItemsService();
	}
	
}

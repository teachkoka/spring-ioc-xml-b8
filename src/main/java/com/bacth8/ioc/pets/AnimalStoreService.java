package com.bacth8.ioc.pets;

public class AnimalStoreService {
	
	ItemsService items;
	
	public AnimalStoreService(ItemsService items){
		this.items = items;
		System.out.println(items);
	}
	
	public void runAnimalService(){
		items.itemsLogic();
	}
}

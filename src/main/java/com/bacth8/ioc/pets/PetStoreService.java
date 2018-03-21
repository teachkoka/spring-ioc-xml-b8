package com.bacth8.ioc.pets;

public class PetStoreService {
	
	ItemsService items;
	PetStoreService(ItemsService items1){
		this.items=items;
		System.out.println(items);
	}
	
	public void runStore(){
		//ItemsService items = new ItemsService();
		items.itemsLogic();
	}

}

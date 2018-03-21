package com.bacth8.ioc.pets;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDemo {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-xml-config.xml");
		PetStoreService service = ctx.getBean("petService",PetStoreService.class);
		service.runStore();
		
		AnimalStoreService aService = ctx.getBean("animalService",AnimalStoreService.class);
		aService.runAnimalService();

	}

}

package com.batch8.ioc.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-xml-config.xml");
		ProperyLoaderConfiguration config = ctx.getBean("prop", ProperyLoaderConfiguration.class);
		config.getConnection();
	}

}

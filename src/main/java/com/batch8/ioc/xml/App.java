package com.batch8.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    //	LaptopDetails dellLaptop = new LaptopDetails();
    
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-xml-config.xml");
    	LaptopDetails dell = ctx.getBean("dell", LaptopDetails.class);
    	LaptopDetails macbook = ctx.getBean("mac", LaptopDetails.class);
    	
    	LaptopDetails hp = ctx.getBean("hp", LaptopDetails.class);
    	
    	System.out.println(dell);
    	System.out.println(macbook);
    	System.out.println(hp);
    	
    	Store str = ctx.getBean("store", Store.class);
    	
    	
    }
}

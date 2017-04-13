package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");  //scan this package and find out where are the annotations
		                           //@component
		
		context.refresh();
		// if you need any instance, do not create
		//you can ask context to get a particular bean getBean()
		
		context.getBean("user");
		//the bean name will same as class name but first
		//character will be lower case
		
		
		System.out.println("created successfully");
		
	}
	
}

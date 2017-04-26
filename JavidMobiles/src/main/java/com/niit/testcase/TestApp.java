package com.niit.testcase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.config.ApplicationContextConfig;

public class TestApp 
{
	@SuppressWarnings("resource")
	public static void main(String[] ar)
	{
		System.out.println("i am in main class");
		
		@SuppressWarnings("unused")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		//context.scan("com.niit");
		//context.refresh();
		
	}

}

package com.jsp.Spring.ProgWithoutXml;
 
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
 
public class MainClient {

	public static void main(String[] args) {

		System.out.println("Project Started");

		ApplicationContext con=new AnnotationConfigApplicationContext(PizzaConfig.class);

		Pizza p=con.getBean("a", Pizza.class);

		System.out.println(p);

		p.deliver();

		System.out.println("Project Ended");

	}
 
}

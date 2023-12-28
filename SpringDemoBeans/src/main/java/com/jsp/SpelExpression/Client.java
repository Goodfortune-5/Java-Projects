package com.jsp.SpelExpression;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class Client {
 
	public static void main(String[] args) {
		    System.out.println( "Execution started!" );
	        ApplicationContext context= new ClassPathXmlApplicationContext("com/jsp/SpeLExpression/Config.xml");
	        SpeLExp s = context.getBean("bean1", SpeLExp.class);
	        System.out.println(s);
	        System.out.println( "Execution Ended!" );
	}
 
}
package com.jsp.Demo.CollectionType;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/jsp/Demo/CollectionType/Config.xml");
        Emp p = context.getBean("emp1", Emp.class);
        System.out.println(p);
        System.out.println( "Project Executed!" );
 
    }
}

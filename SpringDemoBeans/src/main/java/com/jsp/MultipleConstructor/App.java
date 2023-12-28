package com.jsp.MultipleConstructor;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/jsp/MultipleConstructor/Config.xml");
        Test a = context.getBean("test1",Test.class);
        a.add();
        System.out.println(a);
        System.out.println( "Project Executed!" );
 
    }
}
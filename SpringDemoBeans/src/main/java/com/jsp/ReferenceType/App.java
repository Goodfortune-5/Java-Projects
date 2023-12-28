package com.jsp.ReferenceType;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/jsp/ReferenceType/Config.xml");
        B b= context.getBean("refB",B.class);
        System.out.println(b);
        A a= context.getBean("refa",A.class);
        System.out.println(a);

        System.out.println( "Project Executed!" );
 
    }
}
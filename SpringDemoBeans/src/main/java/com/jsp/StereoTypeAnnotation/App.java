package com.jsp.StereoTypeAnnotation;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/jsp/StereoTypeAnnotation/Config.xml");
        Ipl a = context.getBean("ipl", Ipl.class);
        System.out.println(a);
        System.out.println( "Project Executed!" );
 
    }
}
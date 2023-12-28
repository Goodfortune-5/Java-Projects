package com.jsp.Demo.Mod1;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/jsp/Demo/Mod1/Config.xml");
        Student a =(Student) context.getBean("student1");
        System.out.println(a);
        Student b =(Student) context.getBean("student2");
        System.out.println(b);
        System.out.println( "Project Executed!" );
 
    }
}
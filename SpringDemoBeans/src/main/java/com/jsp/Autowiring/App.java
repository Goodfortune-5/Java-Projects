package com.jsp.Autowiring;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/jsp/Autowiring/Config.xml");
//        Certificate c = context.getBean("certi2", Certificate.class);
//        System.out.println(c);
        Student s=context.getBean("stud1", Student.class);
        System.out.println(s);
        System.out.println( "Project Executed!" );
 
    }
}
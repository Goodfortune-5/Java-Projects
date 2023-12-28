package com.jsp.StandAloneCollection;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/jsp/StandAloneCollection/Config.xml");
        Emp p = context.getBean("emp1", Emp.class);
        System.out.println("=================================================");
        System.out.println(p.getVehicle());
        System.out.println(p.getVehicle().getClass().getName());
        System.out.println("=================================================");
        System.out.println(p.getEmail());
        System.out.println(p.getEmail().getClass().getName());
        System.out.println("=================================================");
        System.out.println(p.getName());
        System.out.println(p.getName().getClass().getName());
        System.out.println("=================================================");
        System.out.println(p.getDbprop());
        System.out.println(p.getDbprop().getClass().getName());
        System.out.println("=================================================");
        System.out.println( "Project Executed!" );
 
    }
}
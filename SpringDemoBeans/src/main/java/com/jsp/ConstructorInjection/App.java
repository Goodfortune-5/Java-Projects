package com.jsp.ConstructorInjection;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/jsp/ConstructorInjection/Config.xml");
        Dept d=context.getBean("refDept",Dept.class);
        System.out.println(d);
        Emp e = context.getBean("refEmp", Emp.class);
        System.out.println(e);
//        Emp a = context.getBean("emp1", Emp.class);
        System.out.println( "Project Executed!" );
 
    }
}
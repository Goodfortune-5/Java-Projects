package com.beanLifeCycle;
 
 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started!" );
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/beanLifeCycle/Config.xml");
//        Exam e = context.getBean("exam1", Exam.class);
//        context.registerShutdownHook();
//        
//        System.out.println(e);
        ChickenFry c=context.getBean("c1", ChickenFry.class);
        context.registerShutdownHook();

        System.out.println( "Project Executed!" );
 
    }
}
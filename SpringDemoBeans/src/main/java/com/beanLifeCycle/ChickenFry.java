package com.beanLifeCycle;
 
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
 
public class ChickenFry {
 
//implements InitializingBean,DisposableBean {
	private double cost;
 
	public double getCost() {
		return cost;
	}
 
	public void setCost(double cost) {
		this.cost = cost;
		System.out.println("Setting the cost of Fried Chickens....");
	}
 
	@Override
	public String toString() {
		return "ChickenFry [cost=" + cost + "]";
	}
 
	
//	
//	public void afterPropertiesSet() throws Exception {
//	
//		System.out.println("Collecting the resources to prepare fried chicken");
//		
//	}
//
//	public void destroy() throws Exception {
//		
//		System.out.println("Its done....");
//		
//	}
 
	
    @PostConstruct
	public void start() {
		System.out.println("Collecting the resources to prepare fried chicken");
	}
 
    
    @PreDestroy
	public void stop()  {
		System.out.println("Its done....");
	}
 
	



 
}
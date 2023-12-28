package com.jsp.Spring.ProgWithoutXml;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration
//@ComponentScan(basePackages="com.Spring.ProgWithoutXml")
public class PizzaConfig {
	@Bean
	public Pepsi getPepsi() {
		Pepsi c = new Pepsi();
		return c;
	}
	@Bean(name = {"a","b","c"})
	public Pizza getPizza() {
		Pizza p = new Pizza(getPepsi());
		return p;
	}
 
}
package com.jsp.Spring.ProgWithoutXml;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component("firstPizza")
public class Pizza {
//	@Value("Cheese and Corn")
//	private String pName;
//	@Value("198.36")
//	private double pPrice;
//	
//		
//	public String getpName() {
//		return pName;
//	}
//	public double getpPrice() {
//		return pPrice;
//	}
//	public void setpName(String pName) {
//		this.pName = pName;
//	}
//     
//	public void setpPrice(double pPrice) {
//		this.pPrice = pPrice;
//	}
//	public Pizza() {
//	
//	}
//	
//	
//	
//	
//	@Override
//	public String toString() {
//		return "Pizza [pName=" + pName + ", pPrice=" + pPrice + "]";
//	}

	private Pepsi pepsi;
	void deliver()
	{
		pepsi.drink();
		System.out.println("Deliver My Pizza..!!I am very Hungry");
	}
 
	public Pepsi getPepsi() {
		return pepsi;
	}
 
	public void setPepsi(Pepsi pepsi) {
		this.pepsi = pepsi;
	}
 
	public Pizza(Pepsi pepsi) {
		this.pepsi = pepsi;
	}

 
	public Pizza() {
	}
 
	@Override
	public String toString() {
		return "Pizza [pepsi=" + pepsi + "]";
	}

	}
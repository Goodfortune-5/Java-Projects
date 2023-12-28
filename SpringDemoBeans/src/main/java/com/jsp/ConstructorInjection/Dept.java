package com.jsp.ConstructorInjection;
 
public class Dept {
 
	private String dName;
 
	public Dept(String dName) {
		this.dName = dName;
	}
 
	@Override
	public String toString() {
		return "Dept [dName=" + dName + "]";
	}

}
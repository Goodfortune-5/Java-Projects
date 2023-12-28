package com.jsp.Autowiring;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
 
public class Student {
	@Qualifier("certi1")
	@Autowired
	private Certificate certi;
 
	public Certificate getCerti() {
		return certi;
	}
 
	public void setCerti(Certificate certi) {
		this.certi = certi;
		System.out.println("Setting the property using Setters");
	}
 
	public Student(Certificate certi) {
		this.certi = certi;
		System.out.println("Injecting the property using constructor.....");
	}
 
	public Student() {
 
	}
 
	@Override
	public String toString() {
		return "Student [certi=" + certi + "]";
	}


 
}
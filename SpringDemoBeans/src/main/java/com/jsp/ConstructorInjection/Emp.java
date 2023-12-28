package com.jsp.ConstructorInjection;
 
public class Emp {
 
private String eName;
private int eid;
private double eSal;
private Dept dept;
 
 
 
public Emp(String eName, int eid, double eSal, Dept dept) {
	super();
	this.eName = eName;
	this.eid = eid;
	this.eSal = eSal;
	this.dept = dept;
 
}
 
@Override
public String toString() {
	return "Emp [eName=" + eName + ", eid=" + eid + ", eSal=" + eSal + ", dept=" + dept + "]";
}
 
 
//public Emp(String eName, int eid, double eSal) {
//	this.eName = eName;
//	this.eid = eid;
//	this.eSal = eSal;
//}
//
//
//@Override
//public String toString() {
//	return "Emp [eName=" + eName + ", eid=" + eid + ", eSal=" + eSal + "]";
//}
 
 
 
 
}
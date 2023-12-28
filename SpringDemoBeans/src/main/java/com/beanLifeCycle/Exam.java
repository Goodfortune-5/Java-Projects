package com.beanLifeCycle;
 
public class Exam {
	private String subjectName;
	private double subjectDuration;
	public String getSubjectName() {
		return subjectName;
	}
	public double getSubjectDuration() {
		return subjectDuration;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public void setSubjectDuration(double subjectDuration) {
		this.subjectDuration = subjectDuration;
	}
	public void init() {
		System.out.println("Exam Started");
	}
	public void destroy() {
		System.out.println("Exam Ended");
	}

	@Override
	public String toString() {
		return "Exam [subjectName=" + subjectName + ", subjectDuration=" + subjectDuration + "]";
	}


 
}
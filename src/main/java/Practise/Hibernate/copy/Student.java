package Practise.Hibernate.copy;
 
import javax.persistence.Entity;

import javax.persistence.Id;
 
@Entity

public class Student {
 
	@Id

	private int usn;

	private String name;

	private double marks;

	public int getUsn() {

		return usn;

	}

	public String getName() {

		return name;

	}

	public double getMarks() {

		return marks;

	}

	public void setUsn(int usn) {

		this.usn = usn;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setMarks(double marks) {

		this.marks = marks;

	}

	public Student() {

	}

	@Override

	public String toString() {

		return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + "]";

	}


}

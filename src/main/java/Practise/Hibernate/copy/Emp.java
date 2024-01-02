package Practise.Hibernate.copy;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
 
@Entity
@Table(name="Employees") //Modify name of the table
public class Emp {
 
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int eId;
	private String eName;
	@Transient // Not to save in database
	private double eSal;
	@Column(name="age",length=2) //Modify name of the column
	private int x;

	public Emp() {
	}
 
 
	public int geteId() {
		return eId;
	}
 
 
	public String geteName() {
		return eName;
	}
 
 
	public double geteSal() {
		return eSal;
	}
 
 
	public int getX() {
		return x;
	}
 
 
	public void seteId(int eId) {
		this.eId = eId;
	}
 
 
	public void seteName(String eName) {
		this.eName = eName;
	}
 
 
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
 
 
	public void setX(int x) {
		this.x = x;
	}
 
 
	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", x=" + x + "]";
	}
 
 
}
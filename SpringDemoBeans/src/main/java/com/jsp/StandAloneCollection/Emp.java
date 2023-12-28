package com.jsp.StandAloneCollection;
 
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
 
public class Emp {
 
	private List<String> vehicle;
	private Set<String> email;
	private Map<String,String> name;
	private Properties dbprop;

	public List<String> getVehicle() {
		return vehicle;
	}
	public Set<String> getEmail() {
		return email;
	}
	public Map<String, String> getName() {
		return name;
	}
	public void setVehicle(List<String> vehicle) {
		this.vehicle = vehicle;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public void setName(Map<String, String> name) {
		this.name = name;
	}

	public Properties getDbprop() {
		return dbprop;
	}
	public void setDbprop(Properties dbprop) {
		this.dbprop = dbprop;
	}
	public Emp() {
	}
	public Emp(List<String> vehicle, Set<String> email, Map<String, String> name, Properties dbprop) {
		this.vehicle = vehicle;
		this.email = email;
		this.name = name;
		this.dbprop = dbprop;
	}
	@Override
	public String toString() {
		return "Emp [vehicle=" + vehicle + ", email=" + email + ", name=" + name + ", dbprop=" + dbprop + "]";
	}

 
	
}
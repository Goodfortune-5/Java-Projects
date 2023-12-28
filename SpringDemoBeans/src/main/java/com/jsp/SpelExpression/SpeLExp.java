package com.jsp.SpelExpression;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component("bean1")
public class SpeLExp {
 
	@Value("#{99+63}")
	private int x;
	@Value("#{88>99?8.5:9.5}")
	private double y;
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double power;
 
	@Value("#{T(java.lang.Math).PI}")
	private double staticVariable;
 
	
	@Value("#{5<3}")
	private boolean i;
	@Value("#{new java.lang.String('Varsha')}")
	private String l;
    @Value("#{new java.util.ArrayList().add('Java')}")
    private List<String> stringTypeList;
 
	public int getX() {
		return x;
	}
 
	public double getY() {
		return y;
	}
 
	public double getPower() {
		return power;
	}
 
	public double getStaticVariable() {
		return staticVariable;
	}
 
	public boolean isI() {
		return i;
	}
 
	public String getL() {
		return l;
	}
 
	public List<String> getStringTypeList() {
		return stringTypeList;
	}
 
	public void setX(int x) {
		this.x = x;
	}
 
	public void setY(double y) {
		this.y = y;
	}
 
	public void setPower(double power) {
		this.power = power;
	}
 
	public void setStaticVariable(double staticVariable) {
		this.staticVariable = staticVariable;
	}
 
	public void setI(boolean i) {
		this.i = i;
	}
 
	public void setL(String l) {
		this.l = l;
	}
 
	public void setStringTypeList(List<String> stringTypeList) {
		this.stringTypeList = stringTypeList;
	}
 
	public SpeLExp() {
	}
 
	@Override
	public String toString() {
		return "SpeLExp [x=" + x + ", y=" + y + ", power=" + power + ", staticVariable=" + staticVariable + ", i=" + i
				+ ", l=" + l + ", stringTypeList=" + stringTypeList + "]";
	}



}
package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("#{22+22}")
	private int x;
	@Value("12")
	private int y;
	
	@Value("1")
	private int a;
	@Value("#{ T (java.lang.Math).sqrt(25) }")
	private double z;
	
	
	@Value("#{ T (java.lang.Math).PI }")
	private double pi;
	
	@Value("#{8>6}")
	private boolean isActive;
	
		public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
		public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", a=" + a + ", z=" + z + ", pi=" + pi + ", isActive=" + isActive + "]";
	}
}

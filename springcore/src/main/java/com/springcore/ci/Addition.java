package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a , int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor int a int b");
	}
	
	public Addition(double a , double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor double a double b");
	}
	// mathod
	public void sum() {
		System.out.println("Sum is ="+(this.a+this.b));
	}
}

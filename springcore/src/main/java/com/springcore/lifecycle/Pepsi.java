package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean{
	private double price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// init nu kam karse 
		System.out.println("Pepsi Init");
	}

	@Override
	public void destroy() throws Exception {
		// destroy nu kam kare
		System.out.println("Pepsi puri");
		
	}
	
//	public void init() {
//		System.out.println("Init Method");
//	}
//	public void destroy() {
//		System.out.println("Destory Method");
//	}
}

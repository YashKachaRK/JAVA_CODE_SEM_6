package com.springcore.springcore;

import java.util.List;

public class student {
	private int id ;
	private String name;
	


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", Number=]";
	}
	
}

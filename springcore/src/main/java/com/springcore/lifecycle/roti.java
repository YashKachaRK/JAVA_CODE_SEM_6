package com.springcore.lifecycle;

public class roti {
	private String subjectl;

	public String getSubjectl() {
		return subjectl;
	}

	public void setSubjectl(String subjectl) {
		this.subjectl = subjectl;
	}

	public roti() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "roti [subjectl=" + subjectl + "]";
	}
	public void start() {
		System.out.println("Starting");
	}
	public void end() {
		System.out.println("End");
	}
}

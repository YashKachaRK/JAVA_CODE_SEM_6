package com.jdbc.entites;

public class Student {
	private int id;
	private String first_name;
	private String last_name;
	private int age;
	private String gender;
	private String email;
	private int phone;
	private String address;
	
	
	


	public Student(int id, String first_name, String last_name, int age, String gender, String email, int phone,
			String address) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", age=" + age
				+ ", gender=" + gender + ", email=" + email + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	
}

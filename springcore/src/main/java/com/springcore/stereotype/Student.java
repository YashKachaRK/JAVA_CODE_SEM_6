package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("st")
@Scope("prototype")
public class Student {
	@Value("Yash")
	private String name;
	@Value("#{my}")
	private List<String> city;

	public List<String> getCity() {
		return city;
	}

	public void setCity(List<String> city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
}

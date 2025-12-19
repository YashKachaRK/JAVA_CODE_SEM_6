package com.springcore.stand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stand/config.xml");
		
		Person p = (Person) context.getBean("person1");
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
	}

}

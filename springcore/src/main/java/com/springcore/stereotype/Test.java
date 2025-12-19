package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config2.xml");
		
		Student s =context.getBean("st" , Student.class);
		System.out.println(s);
//		System.out.println(s.getCity());
//		System.out.println(s.getCity().getClass().getName());
		System.out.println(s.hashCode());
		
		Student s1 =context.getBean("st" , Student.class);
		System.out.println(s1);
		System.out.println(s1.hashCode());

		


	}

}

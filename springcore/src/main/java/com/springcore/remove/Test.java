package com.springcore.remove;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		St s = context.getBean("getSt",St.class);
		System.out.println(s);
		s.study();
	}

}

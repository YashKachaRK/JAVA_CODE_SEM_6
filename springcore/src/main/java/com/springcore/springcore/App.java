package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        student student1 = (student)context.getBean("student1");
        student student2 = (student)context.getBean("student2");
        student student3 = (student)context.getBean("student3");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}

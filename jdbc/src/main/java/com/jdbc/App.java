package com.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.entites.Student;
import com.jdbc.insertDataForStudent.StudentInsert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbc/config.xml");
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
    StudentInsert studentInsert = context.getBean("studentInsert",StudentInsert.class);
    Student s = new Student();
    s.setFirst_name("YashKacha");
    s.setLast_name("KAcha");
    
    
    int r = studentInsert.insert(s);
    System.out.println("Resukt"+r);
    
    }
}

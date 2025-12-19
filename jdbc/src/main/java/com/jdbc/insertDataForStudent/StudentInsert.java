package com.jdbc.insertDataForStudent;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.entites.Student;

public class StudentInsert implements insertDataForStudent{
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		
		 
        //insert query
        String query = "INSERT INTO demo (name,city)VALUES (?,?)";
        int r = this.jdbcTemplate.update(query,student.getFirst_name(),student.getLast_name());
        return r;
        
		
	}

	

}

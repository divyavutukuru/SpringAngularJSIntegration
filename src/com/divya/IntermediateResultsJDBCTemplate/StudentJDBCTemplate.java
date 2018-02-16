package com.divya.IntermediateResultsJDBCTemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.divya.IntermediateResultsDAO.StudentDAO;
import com.divya.IntermediateResultsDAO.StudentMapper;
import com.divya.IntermediateResultsPOJO.StudentPOJO;

public class StudentJDBCTemplate implements StudentDAO {
	
	JdbcTemplate jdbcTemplateObject;
	
	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}

	public void setjdbcTemplateObject(JdbcTemplate template) {  
	    this.jdbcTemplateObject = template;  
	}  
	@Override
	public void insertRecords(StudentPOJO student) {
		String Query = "insert into Students(hallTktNo,firstName,lastName,fullName,maths,physics,chemistry,total)"
    			+ "values(?,?,?,?,?,?,?,?)";
		jdbcTemplateObject.update(Query,student.getHallTktNo(),student.getFirstName(),student.getLastName(),
    						student.getFullName(),student.getMaths(),student.getPhysics(),student.getChemistry(),student.getTotal()); 
		
	}

	@Override
	public StudentPOJO getStudent(Integer hallTktNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentPOJO> listStudents() {
		
		String SQL = "select * from Student";
	      List <StudentPOJO> students = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return students;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		
	}


}

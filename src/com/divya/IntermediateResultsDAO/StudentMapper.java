package com.divya.IntermediateResultsDAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.divya.IntermediateResultsPOJO.StudentPOJO;

public class StudentMapper implements RowMapper<StudentPOJO> {

	@Override
	public StudentPOJO mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentPOJO student = new StudentPOJO();
		student.setHallTktNo(rs.getInt("hallTktNo"));
		return student;
	}
}

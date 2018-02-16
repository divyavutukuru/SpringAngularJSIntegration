package com.divya.IntermediateResultsDAO;

import java.util.List;

import javax.sql.DataSource;

import com.divya.IntermediateResultsPOJO.StudentPOJO;

public interface StudentDAO {

  
  /** 
     * This is the method to be used to create
     * a record in the Student table.
  */
  public void insertRecords(StudentPOJO student);
  
  /** 
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
  */
  public StudentPOJO getStudent(Integer hallTktNo);
  
  /** 
     * This is the method to be used to list down
     * all the records from the Student table.
  */
  public List<StudentPOJO> listStudents();
  
  /** 
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
  */
  public void delete(Integer id);
  
  /** 
     * This is the method to be used to update
     * a record into the Student table.
  */
  public void update(Integer id, Integer age);
}

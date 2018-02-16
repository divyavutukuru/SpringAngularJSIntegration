package com.divya.IntermediateResultsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.divya.IntermediateResultsJDBCTemplate.StudentJDBCTemplate;
import com.divya.IntermediateResultsPOJO.StudentPOJO;

	@Controller  
	public class StudentController {  
		
	@Autowired  
	StudentJDBCTemplate dao;//will inject dao from xml file  
	  
	/*It displays a form to input data, here "command" is a reserved request attribute 
	 *which is used to display object data into form 
	 */  
	@RequestMapping("/Examinerform")  
	public ModelAndView showform(){  
	    return new ModelAndView("Examinerform","command",new StudentPOJO());  
	}  
	/*It saves object into database. The @ModelAttribute puts request data 
	 *  into model object. You need to mention RequestMethod.POST method  
	 *  because default request is GET*/  
	@RequestMapping(value="/Save",method = RequestMethod.POST)  
	public ModelAndView save(@ModelAttribute("student") StudentPOJO student){  
	    dao.insertRecords(student);  
	    System.out.println("you are in save method");
	    return new ModelAndView("redirect:/hello");//will redirect to viewemp request mapping  
	}  
	/* It provides list of employees in model object */  
	@RequestMapping("/viewemp")  
	public ModelAndView viewemp(){  
	    List<StudentPOJO> list=dao.listStudents();  
	    return new ModelAndView("viewemp","list",list);  
	}
}

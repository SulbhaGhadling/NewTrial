package com.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Model.Student;
import com.Service.StudentService;

public class MainController {
	private static final Logger LOGGER = LogManager.getLogger(MainController.class);

	public static void main(String[] args) {
		LOGGER.info("Hi, I am info logger.");

		Student st = new Student();
		st=null;
//		st.setsID(121212);
//		st.setsName("Sulbha");
//		st.setsAddress("Pune");
		
		StudentService ss = new StudentService();
		ss.getStudentData(st);
		
		LOGGER.info("Program Executed Successfully.");
	}
}

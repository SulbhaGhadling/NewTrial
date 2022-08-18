package com.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Model.Student;

public class StudentService {
private static final Logger LOGGER = LogManager.getLogger(StudentService.class);

public void getStudentData(Student student)
{
	if(student!=null)
	{
		LOGGER.info(student);
	}
	else
	{
		LOGGER.debug("Student is NULL.");
	}
}
}

package com.capgemini.exam.test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.capgemini.exam.entity.Questions;
import com.capgemini.exam.exception.IDException;
import com.capgemini.exam.exception.ValidationException;
import com.capgemini.exam.service.ExamService;
import com.capgemini.exam.service.ExamServiceImpl;

/****************************************************************************
 * @author: Sourav Singh
 * @description: Creating the ExamTest class to check the
 * different test cases for the ExamService Method
 *****************************************************************************/
public class ExamTest {
	
	 ExamService ser=new ExamServiceImpl();
		
		String[] arr1= {"1.JavaVirtualMachine","2.JavaVerticalMahine","3.JavaVirtueMachine","4.None of these"};
		@Test
		@DisplayName("Test for Add Question Successfully")
		public void testExam1() throws IDException, ValidationException {
			assertTrue(ser.addQuestion(1001, new Questions(16,"What is full form of jvm?",arr1,"JavaVirtualMachine",1)));
			}
		
		@Test
		@DisplayName("Test IDException For Wrong TestID")
		public void testExam2() throws IDException, ValidationException {
			assertThrows(IDException.class, ()->ser.addQuestion(1005, new Questions(14,"What is full form of jvm?",arr1,"JavaVirtualMachine",1)));
			}
		
		@Test()
		@DisplayName("Test Validation For marks is zero")
		public void testExam3() {
			assertThrows(ValidationException.class,() ->{ser.addQuestion(1001,new Questions(4,"What is full form of jvm?",arr1,"JavaVirtualMachine",0));});
			}
		
		@Test
		@DisplayName("Test IDException For Existing Question ID")
		public void testExam4() throws IDException, ValidationException {
			assertThrows(IDException.class, ()->ser.addQuestion(1001, new Questions(7,"What is full form of jvm?",arr1,"JavaVirtualMachine",1)));
			}
		
}
		
		
		


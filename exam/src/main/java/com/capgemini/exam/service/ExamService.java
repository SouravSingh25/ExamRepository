package com.capgemini.exam.service;

import com.capgemini.exam.entity.Questions;
import com.capgemini.exam.exception.IDException;
import com.capgemini.exam.exception.ValidationException;


public interface ExamService {
	
	/***************************************************************
	 * @author Sourav Singh
	 * 
	 * @description: provide the Method to for its implementation.
	 *  and getting support from the Dao Layer
	 *  @Method: addQuestion()
	 *  @return : boolean
	 *  @throws :  IDException, ValidationException
	 *  @param1: testId
	 *  @param2: question
	 * 
	 ***************************************************************/
	public boolean addQuestion(int testId,Questions question)throws IDException, ValidationException;
	

}

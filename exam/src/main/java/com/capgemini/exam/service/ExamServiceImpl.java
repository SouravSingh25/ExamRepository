package com.capgemini.exam.service;

import com.capgemini.exam.dao.ExamDao;
import com.capgemini.exam.dao.ExamDaoImpl;
import com.capgemini.exam.entity.Exam;
import com.capgemini.exam.entity.Questions;
import com.capgemini.exam.exception.IDException;
import com.capgemini.exam.exception.ValidationException;

/***************************************************************
 * @author Sourav Singh
 * 
 * @description: Implements the ExamService method 
 * 
 ***************************************************************/

public class ExamServiceImpl implements ExamService {
	private ExamDao dao = new ExamDaoImpl();

	public boolean addQuestion(int testId, Questions question) throws IDException, ValidationException {
		
		/***************************************************************
		 * @author Sourav Singh
		 * 
		 * @description: To check the validations  and throws Exceptions 
		 * 
		 ***************************************************************/
		if(!question.getQuestionTitle().matches("^[a-zA-Z0-9\\s+]*$")&&  question.getQuestionTitle()==null && question.getQuestionTitle().length()>20)
			throw new ValidationException("Question should be having length less than 20 and all letter are alphanumeric...");
		if(question.getQuestionAnswer().length()>20 && !question.getQuestionAnswer().matches("^[a-zA-Z]*$\\s+"))
			throw new ValidationException("Answer should be having length less than 10 and all letter are alphabets...");
		if(question.getQuestionOptions().length>10)
			throw new ValidationException("Options Array should be having length less than 5");
		if(question.getQuestionId()<=0)
			throw new ValidationException("Id should be more than 0");
		if(question.getQuestionMarks()<=0)
			throw new ValidationException("Marks should be more than 0");
	
		/***************************************************************
		 * @author Sourav Singh
		 * 
		 * @description: To  assign questions to a specific Exam 
		 * 
		 ***************************************************************/
		Exam exam = dao.getTest(testId);
		dao.addQuestion(exam, question);
		return true;
	}


}




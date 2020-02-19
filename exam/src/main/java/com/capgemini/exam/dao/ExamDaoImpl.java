package com.capgemini.exam.dao;

import java.util.Map;

import com.capgemini.exam.entity.Exam;
import com.capgemini.exam.entity.Questions;
import com.capgemini.exam.exception.IDException;
import com.capgemini.exam.repo.ExamRepo;

/***************************************************************
 * @author Sourav Singh
 * @description: Implements the ExamDao methods 
 ***************************************************************/
public class ExamDaoImpl implements ExamDao {

/***************************************************************
 * @description: Creating the Map in which we are getting
 * key as Integer and value as Exam type. Its reference i.e.
 * tmap get the test values from ExamRepo class
 ***************************************************************/
	public static Map<Integer, Exam> tmap = ExamRepo.tmap;
	
	/***************************************************************
	 * @description: To add a question in a specific test
	 * @method: addQuestion()
	 * @returnType: boolean 
	 * @parameter1: exam
	 * @parameter2: question 
	 * @Throws: IDException
	 ***************************************************************/	
@Override
	public boolean addQuestion(Exam exam, Questions question) throws IDException {
		if(exam.getQmap().containsKey(question.getQuestionId()))
			throw new IDException("Question ID already exists!.");
		 exam.getQmap().put(question.getQuestionId(),question);
		return true;
	}

/*******************************************************************
 * @description: To get the specific testId from the Map reference
 * @method: getTest()
 * @returnType: Exam
 * @parameter: testId
 * @exception: IDException
 *******************************************************************/
@Override
	public Exam getTest(int testId) throws IDException {
		if(!tmap.containsKey(testId))
			throw new IDException("Test Not Found");
		return tmap.get(testId);
	}
}

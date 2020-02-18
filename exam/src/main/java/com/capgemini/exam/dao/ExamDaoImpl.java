package com.capgemini.exam.dao;

import java.util.Map;

import com.capgemini.exam.entity.Exam;
import com.capgemini.exam.entity.Questions;
import com.capgemini.exam.exception.IDException;
import com.capgemini.exam.repo.ExamRepo;

/***************************************************************
 * @author Sourav Singh
 * 
 * @description: Implements the ExamDao methods 
 * 
 ***************************************************************/


public class ExamDaoImpl implements ExamDao {

/*Creating a map 
 * 
 */
	public static Map<Integer, Exam> tmap = ExamRepo.tmap;
	/***************************************************************
	 * @author Sourav Singh
	 * 
	 * @description: To add a question in a specific test
	 * @method: addQuestion()
	 * @returnType: boolean 
	 * @parameter1: exam
	 * @parameter2: question 
	 * @Throws: IDException
	 * 
	 ***************************************************************/	
@Override
	public boolean addQuestion(Exam exam, Questions question) throws IDException {
		if(exam.getQmap().containsKey(question.getQuestionId()))
			throw new IDException("Question ID already exists!.");
		 exam.getQmap().put(question.getQuestionId(),question);
		return true;
	}
/*******************************************************************
 * @author Sourav Singh
 * 
 * @description: To get the specific testId from the Map reference
 * @method: getTest()
 * @returnType: Exam
 * @parameter: int type
 * @exception: IDException
 * 
 *******************************************************************/
@Override
	public Exam getTest(int testId) throws IDException {
		if(!tmap.containsKey(testId))
			throw new IDException("Test Not Found");
		
	
		return tmap.get(testId);
	}


	
	

}

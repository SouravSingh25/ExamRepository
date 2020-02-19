package com.capgemini.exam.dao;

import com.capgemini.exam.entity.Exam;
import com.capgemini.exam.entity.Questions;
import com.capgemini.exam.exception.IDException;

/***************************************************************
 * @author Sourav Singh
 * @description: Creating the Interface i.e.ExamDao and
 * it provide the Methods for the implementations and
 * this class fetch the information from repository and
 * provide support to the service
 * @Methods: addQuestion() and getTest()
 * @return : boolean and Exam
 * @throws : IDException
 * @param1: testId in getTest() method
 * @param2: question in addQuestion() method
 * @param3: exam in addQuestion() method
 ***************************************************************/
public interface ExamDao {
	public boolean addQuestion(Exam exam,Questions question) throws IDException;

	public Exam getTest(int testId) throws IDException;
}

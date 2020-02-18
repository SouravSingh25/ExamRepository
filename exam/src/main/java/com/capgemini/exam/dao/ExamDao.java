package com.capgemini.exam.dao;

import java.math.BigInteger;

import java.util.List;

import com.capgemini.exam.entity.Questions;
import com.capgemini.exam.exception.IDException;
import com.capgemini.exam.entity.Exam;

/***************************************************************
 * @author Sourav Singh
 * 
 * @description: provide the Methods to for its implementation.
 *  this class fetch the information from repository
 *  and provide support to the service
 * 
 ***************************************************************/
public interface ExamDao {
	public boolean addQuestion(Exam exam,Questions question) throws IDException;

	public Exam getTest(int testId) throws IDException;
}

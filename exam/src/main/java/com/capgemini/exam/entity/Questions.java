package com.capgemini.exam.entity;

import java.util.Arrays;
/*************************************************************
 * @author Sourav Singh 
 * 
 * @description: Creating a Question class
 * 
 *************************************************************/

public class Questions {
	
	/**********************************************************
	 * @description: provide the fields for Question class
	 * 
	 **********************************************************/
	private Integer questionId;
	private String questionTitle;
	private String[] questionOptions;
	private String questionAnswer;
	private int questionMarks;
	
	/**********************************************************
	 * @description: provide the constructor using fields
	 * 
	 **********************************************************/
	public Questions(Integer questionId, String questionTitle, String[] questionOptions, String questionAnswer,
			int questionMarks) {
		super();
		this.questionId = questionId;
		this.questionTitle = questionTitle;
		this.questionOptions = questionOptions;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		
	}
	/**********************************************************
	 * @description: provide the no-argument constructor
	 * 
	 **********************************************************/
	public Questions() {
		
	}
	
	/**********************************************************
	 * @description: provide the getters and setters
	 * 
	 **********************************************************/
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String[] getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String[] questionOptions) {
		this.questionOptions = questionOptions;
	}
	public String getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	
	public int getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(int questionMarks) {
		this.questionMarks = questionMarks;
	}
	
	/**********************************************************
	 * @description: Override toString() using fields
	 * 	  
	 **********************************************************/
	@Override
	public String toString() {
		return "Questions questionId=" + questionId + ", questionTitle=" + questionTitle + ", questionOptions="
				+ Arrays.toString(questionOptions) + ", questionAnswer=" + questionAnswer + ", questionMarks="
				+ questionMarks ;
	}

	

}

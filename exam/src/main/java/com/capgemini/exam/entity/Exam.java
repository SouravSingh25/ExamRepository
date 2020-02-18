package com.capgemini.exam.entity;

import java.math.BigDecimal;

/*************************************************************
 * @author Sourav Singh 
 * 
 * @description: Creating a Exam class
 * 
 *************************************************************/
import java.util.HashMap;
import java.util.Map;

public class Exam {
	
	/**********************************************************
	 * @description: provide the fields for Exam class
	 * 
	 **********************************************************/
	private  Integer testId;
	private  String testName;
	private Integer totalMarks;
	private Map<Integer, Questions> qmap = new HashMap<Integer,Questions>();
	
	/**********************************************************
	 * @description: provide the constructor using fields
	 * 
	 **********************************************************/
	public Exam(Integer testId, String testName, Integer totalMarks) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.totalMarks = totalMarks;
		
	}

	/**********************************************************
	 * @description: provide the no-argument constructor
	 * 
	 **********************************************************/
	public Exam() {
		
	}
	
	/**********************************************************
	 * @description: provide the getters and setters
	 * 
	 **********************************************************/
	public Map<Integer, Questions> getQmap() {
		return qmap;
	}
	public void setQmap(Map<Integer, Questions> qmap) {
		this.qmap = qmap;
	}
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTestScored(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	/**********************************************************
	 * @description: Override toString() using fields
	 * 	  
	 **********************************************************/
	@Override
	public String toString() {
		return "Test testId=" + testId + ", testName=" + testName + ", totalMarks=" + totalMarks + ", qmap=" + qmap;
	}
	

}

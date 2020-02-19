package com.capgemini.exam.repo;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.exam.entity.Exam;
import com.capgemini.exam.entity.Questions;

/***************************************************************
 * @author : Sourav Singh
 * @description: Creating the repository class
 ***************************************************************/
public class ExamRepo {
	/*******************************************************************
	 * @description: Creating a Map for Exam in which
	 * it is getting key as a Integer and value as an Exam instances
	 *******************************************************************/
	public static Map<Integer, Exam> tmap = new HashMap<Integer, Exam>();

	static {
		/*************************************************************** 
		 * @description: Adding Exam  and put into the map reference
		 ***************************************************************/
		Exam test1=new Exam(1001,"Test1",8);
		Exam test2=new Exam(1002,"Test2",7);
		
		tmap.put(test1.getTestId(), test1);
		tmap.put(test2.getTestId(), test2);	
		
		
		/****************************************************************
		 * @description: Creating the options for the questions
		 ***************************************************************/
		String[] arr1= {"1.AbstractLis","2.LinkedList","3.ArrayList","4.None of these"};
		String[] arr2= {"1.ArrayList()","2.DynamicList()","3.LinkedList()","4. MallocList()"};
		String[] arr3= {"1.Capacity()","2.increaseCapacity()","3.ncreasecapacity()","4.ensureCapacity()"};
		String[] arr4= {"1.size()","2.length()","3.index()","4.capacity()"};
		String[] arr5= {"1.Array()","2.covertArray()","3.toArray()","4.covertoArray()"};
		String[] arr6= {"1.trim()","2.trimSize()","3.trimTosize()","4.trimToSize()"};
		String[] arr7= {"1.this","2.super","3.extend","4.extends"};
		String[] arr8= {"1.static","2.final","3.protected","4.private"};
		String[] arr9= {"1.super(void)","2.superclass.()","3.super.A();","4.super()"};
		String[] arr10= {"1.Abstraction","2.Encapsulation","3.Polymorphism","4.None of these"};
		String[] arr11= {"1.Process","2.System","3.Object","4.None of these"};
		String[] arr12= {"1.clone()","2.copy()","3.duplicate","4.None of these"};
		String[] arr13= {"1.max()","2.min()","3.abs()","4.all of these"};
		String[] arr14= {"1.Math","2.System","3.Object","4.Process"};
		String[] arr15= {"1.Class","2.Object","3.System","4.Runtime"};
		
		/*********************************************************************
		 * @description: Adding Questions and Creating a Map ,
		 *  Map is for getting the key as a Integer and 
		 *  value as a question instance
		 ********************************************************************/
		Questions ques1=new Questions(1,"Which of these standard collection classes implements a dynamic array?",arr1,"ArrayList",1);
		Questions ques2=new Questions(2,"Which of these class can generate an array which can increase and decrease in size automatically?",arr2,"ArrayList()",1);
		Questions ques3=new Questions(3,"Which of these method can be used to increase the capacity of ArrayList object manually?",arr3,"ensureCapacity()",1);
		Questions ques4=new Questions(4,"Which of these method of ArrayList class is used to obtain present size of an object?",arr4,"size()",1);
		Questions ques5=new Questions(5,"Which of these methods can be used to obtain a static array from an ArrayList object?",arr5,"toArray()",1);
		Questions ques6=new Questions(6,"Which of these method is used to reduce the capacity of an ArrayList object?",arr6,"trimToSize()",1);
		Questions ques7=new Questions(7,"Which of this keyword can be used in a subclass to call the constructor of superclass?",arr7,"this",1);
		Questions ques8=new Questions(8,"Which of these keywords can be used to prevent Method overriding?",arr8,"final",1);
		Questions ques9=new Questions(9,"Which of these is correct way of calling a constructor having no parameters, of superclass A by subclass B?",arr9,"super()",1);
		Questions ques10=new Questions(10,"Which of these is supported by method overriding in Java?",arr10,"Polymorphism",1);
		Questions ques11=new Questions(11,"Which of these class is a superclass of all other classes?",arr11,"Object",1);
		Questions ques12=new Questions(12,"Which of these method of Object class can generate duplicate copy of the object on which it is called?",arr12,"clone()",1);
		Questions ques13=new Questions(13,"Which of these method is a rounding function of Math class?",arr13,"all of these",1);
		Questions ques14=new Questions(14,"Which of these class contains only floating point functions?",arr14,"Math",1);
		Questions ques15=new Questions(15,"Which of these class encapsulate the runtime state of an object or an interface?",arr15,"Class",1);
		
		Map<Integer,Questions> qmap=new HashMap<Integer,Questions>();
		
		/************************************************************************
		 * @description: we are putting the value of questions to the
		 * question reference...
		 ************************************************************************/
		qmap.put(ques1.getQuestionId(), ques1);
		qmap.put(ques2.getQuestionId(), ques2);
		qmap.put(ques3.getQuestionId(), ques3);
		qmap.put(ques4.getQuestionId(), ques4);
		qmap.put(ques5.getQuestionId(), ques5);
		qmap.put(ques6.getQuestionId(), ques6);
		qmap.put(ques7.getQuestionId(), ques7);
		qmap.put(ques8.getQuestionId(), ques8);
				
		Map<Integer,Questions> qmap2=new HashMap<Integer,Questions>();
		qmap2.put(ques9.getQuestionId(), ques9);
		qmap2.put(ques10.getQuestionId(), ques10);
		qmap2.put(ques11.getQuestionId(), ques11);
		qmap2.put(ques12.getQuestionId(), ques12);
		qmap2.put(ques13.getQuestionId(), ques13);
		qmap2.put(ques14.getQuestionId(), ques14);
		qmap2.put(ques15.getQuestionId(), ques15);
		
		/**********************************************************************
		 * @description:Assigning the set of questions to the different tests 
		 **********************************************************************/
		test1.setQmap(qmap);
		test2.setQmap(qmap2);
	
	}
}

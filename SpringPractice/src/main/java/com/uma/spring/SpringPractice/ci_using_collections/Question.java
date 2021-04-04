package com.uma.spring.SpringPractice.ci_using_collections;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	//private List<String> list;
	private List<Answer> ans;
	Question(){}

	public Question(int id, String name, List<Answer> list) {
		super();
		this.id = id;
		this.name = name;
		this.ans = list;
	}
	public void displayInfo()
	{
		System.out.println(id+"  "+name);
		System.out.println("answers are:");
		Iterator itr=ans.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

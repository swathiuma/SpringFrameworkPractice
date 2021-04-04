package com.uma.spring.SpringPractice;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	
public Student(String name) {
		super();
		this.name = name;
	}
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
public void displayInfo()
{
	System.out.println("Hello  "+name);
}
}

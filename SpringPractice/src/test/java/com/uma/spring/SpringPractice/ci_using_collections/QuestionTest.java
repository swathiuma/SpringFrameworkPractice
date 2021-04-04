package com.uma.spring.SpringPractice.ci_using_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("applicationContext.xml");
		Question q=(Question)c.getBean("que");
		q.displayInfo();

	}

}

package com.uma.spring.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       
        Car c=(Car)context.getBean("car");
        c.drive();

	}

}

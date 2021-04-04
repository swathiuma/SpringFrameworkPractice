package com.uma.spring.SpringPractice.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e;
		/*Employee e=(Employee)context.getBean("e1");
		e.show();
		e=(Employee)context.getBean("e2");
		e.show();*/
		e=(Employee)context.getBean("e3");
		e.show();
		
	}

}

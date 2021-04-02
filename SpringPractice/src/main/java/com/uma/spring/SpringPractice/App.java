package com.uma.spring.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        /*Student student=(Student)context.getBean("studentBean");
        student.displayInfo();*/
        Car c=(Car)context.getBean("car");
        c.drive();
    }
}

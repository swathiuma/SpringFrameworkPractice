package com.uma.spring.SpringPractice.constructorInjection;

public class Employee {
	private int id;
	private String name;
	private Address addr;
Employee()
{
	System.out.println("default constructor");
}
Employee(int i)
{
	this.id=id;
}
Employee(String s)
{
	this.name=s;
}
Employee(int i,String s)
{
	this.id=i;
	this.name=s;
}
public Employee(int id, String name, Address addr) {
	super();
	this.id = id;
	this.name = name;
	this.addr = addr;
}
void show()
{
	System.out.println(id+" "+name);
	System.out.println(addr.toString());
}


}

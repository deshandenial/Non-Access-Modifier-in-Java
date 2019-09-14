package com.abstractkeyword_abstract_cls_methods;


abstract class Person
{
	String name;
	
	Person(String name) 
	{
		this.name = name;
	}
	
	void display()
	{
		System.out.println(name);
	}
	
}


class Student extends Person

{

	Student(String name)
	{
		super(name);
		
	}
	
	
}



public class AbstractClassDemo3 
{
  
  

}

package com.finalkeyword_final_variable;

public class FinalVariable1
{
	final int age = 25 ;

	public void printAge()
	{
		// if final value don't changes. increment and decrement the age value.
		System.out.println("print age : " + age);
	}
	
	public static void main(String[] args) 
	{
		FinalVariable1 obj = new FinalVariable1();
		obj.printAge();
		
		
	}

}

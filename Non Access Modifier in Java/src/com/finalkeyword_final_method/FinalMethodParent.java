package com.finalkeyword_final_method;

public class FinalMethodParent 
{
	
	final void Method1()
	{
		System.out.println("hai");
	}	
	
	public static void main(String[] args) {
		Demo cls =new Demo();
		cls.Method1();
	}
	
}


class Demo  extends FinalMethodParent
{    
	
	
	//Cannot override the final method from FinalMethodParent
	// void Method1()
	{
		System.out.println("hello");
	}
}
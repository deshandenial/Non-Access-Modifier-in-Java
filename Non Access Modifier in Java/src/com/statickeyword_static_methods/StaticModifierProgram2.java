package com.statickeyword_static_methods;

public class StaticModifierProgram2 
{
	// here variable as  declared non static variable . Actually this is a Instance variable 
	String name = "deshan";
	
	public static void Method1()
	{
		// compile time error display because of instance variable does not access on static methods
		// System.out.println("print name : " + name);
	}

	
	public static void main(String[] args) {
		StaticModifierProgram2 obj = new StaticModifierProgram2();
		obj.Method1();
	}
}

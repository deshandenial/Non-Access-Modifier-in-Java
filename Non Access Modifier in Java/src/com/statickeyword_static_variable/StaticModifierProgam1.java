package com.statickeyword_static_variable;

public class StaticModifierProgam1 
{
	// variable as declared static keyword then this one variable can be called Static method and non static method
	static String name = "deshan";
	
	
	public void method1()
	{
		
		// here i'm are accessing the static variable but method as declared "Non static variable".
		System.out.println("print name : " + name);
	}

	public static void main(String[] args) {
		
		
		StaticModifierProgam1 obj = new StaticModifierProgam1();
		obj.method1();
		
	}
}

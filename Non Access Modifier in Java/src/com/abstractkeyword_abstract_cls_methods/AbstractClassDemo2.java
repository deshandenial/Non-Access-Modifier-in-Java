package com.abstractkeyword_abstract_cls_methods;

// Example 2: Abstract class containing the abstract and non-abstract method


abstract class Mobile
{
	abstract void RAM();
	
	public void CAMERA(String camera)
	{
		System.out.println("print camera :" + camera);
		
	}
}


class REDMI extends Mobile
{
	@Override
	public void RAM()
	{
		System.out.println("=======64 GM RAM==========");
	}
}


public class AbstractClassDemo2 
{

	public static void main(String[] args) 
	{
		REDMI cls = new REDMI();
		cls.CAMERA("8 MB Pixel");
		cls.RAM();
		
	}
}

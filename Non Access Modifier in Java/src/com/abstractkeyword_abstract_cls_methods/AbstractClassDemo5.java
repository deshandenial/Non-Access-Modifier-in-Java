package com.abstractkeyword_abstract_cls_methods;

abstract class Dress
{
	abstract void jeans();
	
	public void shirts()
	{
		System.out.println("print the shirts..");
	}
	
	abstract void shoes(String abc);
}


class Jeans extends Dress
{
	@Override
	public void jeans()
	{
		System.out.println("jeans...................");
	}
	@Override
	public void shoes(String arg)
	{
		System.out.println("shoes..................."+ arg);
	}
}



public class AbstractClassDemo5 
{

	public static void main(String[] args) 
	{
		Dress dress = new Jeans();
		dress.jeans();
		dress.shoes("NIKE");
		dress.shirts();
	}
}

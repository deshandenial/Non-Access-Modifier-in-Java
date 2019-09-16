package com.abstractkeyword_abstract_cls_methods;

// Example 1: Abstract class containing the abstract method 

abstract class Bike
{
	abstract void speed();
	abstract void model();
}


class Honda extends Bike
{
	@Override
	public void speed()
	{
		System.out.println("======= HONDA=========");
	}
	@Override
	public void model()
	{
		System.out.println("========CBR===========");
	}
}



public class AbstractClassDemo1 
{
	public static void main(String[] args) {
		
		/*Honda cls = new Honda();
		cls.speed();
		cls.model();*/
		
		//use any one way
		
		Bike bike = new Honda();
		bike.speed();
		bike.model();
	}

}

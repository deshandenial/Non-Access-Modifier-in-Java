package com.abstractkeyword_abstract_cls_methods;


abstract class Bikes
	{
		abstract void mileage();
		abstract void speed();
	}
	
	
	class R15 extends Bikes
	{
		@Override
		void mileage()
		{
		
			System.out.println("R15 milegae per meter : 40 kms ");
		}
		
		@Override
		void speed()
		{
			System.out.println("R15 speed per sec : 50+ kmps");
			
		}
	}


	class KTM extends Bikes
	{
		@Override
		void mileage()
		{
			System.out.println("KTM milegae per meter : 40 kms ");
		}
		
		@Override
		void speed()
		{
			System.out.println("KTM speed per sec : 40+ kmps ");
		}
	}



public class AbstractClassDemo3 
{
	public static void main(String[] args) 
	{
		/*Bikes cls1 = new KTM();
		cls1.mileage();
		cls1.speed();
		Bikes cls2 = new R15();
		cls2.mileage();
		cls2.speed();*/
		
		KTM obj1 = new KTM();
		obj1.mileage();
		obj1.speed();
		R15 obj2 = new R15();
		obj2.mileage();
		obj2.speed();
	}
}

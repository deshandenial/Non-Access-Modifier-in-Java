package com.abstractkeyword_abstract_cls_methods;

public class AbstractClassDemo6
{
	public static void main(String[] args) 
	{
		DemoIPhone cls = new DemoIPhone();
		
		DemoAndroid cls2 = new DemoAndroid();
		show(cls2);
		show(cls);
	}

	public static void show(DemoAndroid cls2)
	{
		
		cls2.showConfig();
	}
	public static void show(DemoIPhone cls)
	{
		cls.showConfig();
	}

}


class DemoIPhone
{
	public void showConfig()
	{
		System.out.println("IPhone 4 GM RAM");
	}
}
class DemoAndroid
{
	public void showConfig()
	{
		System.out.println("Android 2 GM RAM");
	}
}

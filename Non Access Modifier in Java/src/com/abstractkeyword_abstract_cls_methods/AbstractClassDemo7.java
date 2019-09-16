package com.abstractkeyword_abstract_cls_methods;

public class AbstractClassDemo7 
{

	public static void main(String[] args) 
	{
		Iphonecls cls1 = new Iphonecls();
		Androidcls cls2 = new Androidcls();
		show(cls2);
	}
		
		public static void show(Phone phone)
		{
			phone.showConfig();
		
		}
		
		
		
}


abstract class Phone
{
	abstract void showConfig();
	
}



class Iphonecls extends Phone
{
	
	public void showConfig()
	{
		System.out.println("Hi am IPhone");
	}

	
}

class Androidcls extends Phone
{
	public void showConfig()
	{
		System.out.println("Hi am Android");
	}
}

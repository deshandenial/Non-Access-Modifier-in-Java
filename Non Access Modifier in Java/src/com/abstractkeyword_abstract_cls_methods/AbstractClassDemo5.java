package com.abstractkeyword_abstract_cls_methods;

public class AbstractClassDemo5
{
	public static void main(String[] args) 
	{
		
	
		Nokiaphone cls = new Iphone();
		cls.call();
		cls.camera();
		cls.move();
		cls.UI();
		
	}

}


abstract class Nokiaphone
{
	public void call() 
	{
		System.out.println("Nokia Phone able to call to others");
	}
	public abstract void camera();
	public abstract void move();
	public abstract void UI();
}

abstract class Androidphone extends Nokiaphone

{
	/*public void call() 
	{
		System.out.println("Android Phone able to call to others");
	}*/
	
	public void camera()
	{
		System.out.println("Android Phone able to take picture");
	}
	
	public void move()
	{
		System.out.println("Android Phone able to Move");
	}
}


class Iphone extends Androidphone
{
	/*public void camera()
	{
	
		System.out.println(" IPhone able to call to others");
	}*/
	
	public void UI()
	{
		System.out.println("IPhone easy to access by using UI");
	}
}
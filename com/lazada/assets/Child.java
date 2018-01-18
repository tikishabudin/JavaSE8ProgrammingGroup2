package com.lazada.assets;

public class Child extends Parent 
{
	public Child()
	{
		this(10);
		System.out.println("Child Default Constructor");
	}
	
	public Child(int x)
	{
		super(5);
		System.out.println("Child Overloaded Constructor");
	}
	
	@Override
	public void doSomething()
	{
		System.out.println("Child doing something");
	}
	
	public void play()
	{
		System.out.println("Child playing with " + this.name);
	}
	
	@Override
	public String toString()
	{
		return "This is a child object";
	}
	
	@Override
	public boolean equals(Object x)
	{
		if(this.infoIndex == ((Child)x).infoIndex)
			return true;
		return false;
	}
}







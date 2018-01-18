package com.lazada.assets;


//ABSTRACT RULES
//1) A class with even 1 abstract method MUST be declared abstract
//2) Abstract classes CANNOT be instantiated
//3) Child classes MUST override ALL abstract methods in the parent
public abstract class Parent 
{
	public Parent()
	{
		System.out.println("Parent Default Constructor");
	}
	
	public Parent(int x)
	{
		this();
		System.out.println("Parent Overloaded Constructor");
	}
	
	protected String name = "Parent";
	public int infoIndex;
	
	public abstract void doSomething();
	
	public void doSomething(String x)
	{
		System.out.println("Parent doing something overloaded");
	}
}





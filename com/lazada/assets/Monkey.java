package com.lazada.assets;

public class Monkey 
{
	public static int numMonkeys = 0;
	private int bananas;
	private String name;
	
	public static void showMonkeys()
	{
		System.out.format("There are currently %d monkey objects\n",
				numMonkeys);
		//System.out.println(o.name);
	}
	
	//Default Constructor
	public Monkey()
	{
		System.out.println("Default Monkey Constructor");
		this.name = "John Doe";
		this.bananas = 100;
		numMonkeys++;
	}
	
	public Monkey(String name, int bananas)
	{
		System.out.println("Overloaded Monkey Constructor");
		this.name = name;
		this.bananas = bananas;
		numMonkeys++;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void eating()
	{
		System.out.println(this.name + " Monkey eating");
	}
	
	public void eating(String x)
	{
		System.out.println(this.name + " is eating " + x);
	}
	
	public void eating(boolean real)
	{
		if(real)
		{
			System.out.println("This is really a monkey eating");
		}
		else
		{
			System.out.println("It's just " + this.name + " eating");
		}
	}
}




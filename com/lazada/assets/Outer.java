package com.lazada.assets;

public class Outer 
{
	private int data;
	private Inner depend;
	
	public Outer()
	{
		this.depend = new Inner();
	}
	
	public static class Inner
	{
		public int doSomething(Outer ref)
		{
			return ref.data;
		}
	}

}

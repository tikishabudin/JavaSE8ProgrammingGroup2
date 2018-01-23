package com.lazada.assets;

import java.io.Serializable;

public class Customer implements Serializable
{
	public String name;
	public LazadaWallet custWallet = new LazadaWallet();
	public transient int whatever;
	
	public Customer(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
}

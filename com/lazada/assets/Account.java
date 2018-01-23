package com.lazada.assets;

import java.io.Serializable;

public abstract class Account implements Serializable
{
	private int id;
	private String holderName;
	private double balance;
	
	private static int idSeries = 100;
	
	public Account(String name, double balance)
	{
		this.id = idSeries++;
		this.holderName = name;
		this.balance = balance;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getHolderName()
	{
		return this.holderName;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	protected void setBalance(double amount)
	{
		this.balance += amount;
	}
	
	public abstract boolean withdraw(double amount);
	public abstract boolean deposit(double amount);
}









package com.lazada.assets;

public class CheckingAccount extends Account 
{
	private final double transactionFee = 0.5;
	
	public CheckingAccount(String name, double balance)
	{
		super(name,balance);
	}
	
	@Override
	public boolean withdraw(double amount)
	{
		if((this.getBalance()-amount-this.transactionFee) >= 0)
		{
			this.setBalance(0-amount-this.transactionFee);
			return true;
		}	
		return false;
	}
	
	@Override
	public boolean deposit(double amount)
	{
		if((this.getBalance()+amount-this.transactionFee) >= 0)
		{
			this.setBalance(amount-this.transactionFee);
			return true;
		}
		return false;
	}
}







package com.lazada.assets;

import java.io.Serializable;

public class SavingsAccount extends Account implements Serializable
{
	private final double incentive = 0.5;

	public SavingsAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if((this.getBalance() - amount) >= 0)
		{
			this.setBalance(0-amount);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		this.setBalance(amount + this.incentive);
		return true;
	}
	
	
}

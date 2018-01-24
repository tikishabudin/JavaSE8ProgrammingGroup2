package com.lazada.assets;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CheckingAccountTestParam {

	private String hName;
	private double startBal;
	private double testAmount;
	private CheckingAccount ca;
	
	public CheckingAccountTestParam(String hName, 
									double startBal, 
									double testAmount)
	{
		this.hName = hName;
		this.startBal = startBal;
		this.testAmount = testAmount;
	}
	
	@Before
	public void setup()
	{
		ca = new CheckingAccount(this.hName, this.startBal);
	}
	
	@Test
	public void testPositiveBalance() {
		ca.withdraw(this.testAmount);
		assertTrue(ca.getBalance() >= 0);
	}
	
	@Test
	public void makeSureNoEmptyName()
	{
		assertNotEquals("", ca.getHolderName());
	}

	@Parameterized.Parameters
	public static Collection<Object[]> testConditions()
	{
		return Arrays.asList(new Object[][] {
			{"Tiki",100,150},
			{"Tiki",300,2},
			{"Loc", 2000, 1500}
		});
	}
}

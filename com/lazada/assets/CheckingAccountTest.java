package com.lazada.assets;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckingAccountTest {

	CheckingAccount ca = null;
	
	@BeforeClass
	public static void classSetup()
	{
		System.out.println("Before the class even starts");
	}
	
	@Before
	public void testSetup()
	{
		ca = new CheckingAccount("Tiki Shabudin", 1000.00);
	}
	
	@Test
	public void test() 
	{
		int x = 5;
		//assertEquals(5, x);
		assertTrue(x<10);
	}
	
	@Test
	public void checkingAccountIsCreatable()
	{
		
		assertNotNull(ca);
	}
	
	@Test
	public void ensureAccountHasPositiveBalance()
	{
		
		ca.withdraw(99.467);
		//System.out.println("Balance: " + ca.getBalance());
		assertTrue(ca.getBalance()>0);
	}

	@Test
	public void testingAssertThat()
	{
		
		//Only available from JUnit 4
		assertThat(ca.getHolderName(),is("Tiki Shabudin"));
	}
	
	@After
	public void cleanup()
	{
		System.out.println("Cleaning up after test case...");
	}
	
	@AfterClass
	public static void cleanupClass()
	{
		System.out.println("Cleaning up after entire class...");
	}
}









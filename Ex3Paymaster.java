import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.lazada.assets.Account;
import com.lazada.assets.CheckingAccount;
import com.lazada.assets.SavingsAccount;

public class Ex3Paymaster 
{
	private static final Scanner uin = new Scanner(System.in);
	private static Map<String,Account> userAccounts = new TreeMap<>();
	
	public static void displayMenu()
	{
		System.out.println("PAYMASTER 9000");
		System.out.println("(1) Register a new user");
		System.out.println("(2) Calculate pay");
		System.out.println("(3) List users");
		System.out.println("(X) Exit");
		System.out.print("Enter choice: ");
	}
	
	public static void registerUser()
	{
		String name = "";
		do
		{
			System.out.println("Enter User Name");
			name = uin.nextLine();
		}
		while(userAccounts.get(name) != null);
		
		System.out.println("Account type?");
		System.out.println("(1) Checking Account");
		System.out.println("(2) Savings Account");
		System.out.print("Choice: ");
		switch(uin.nextLine())
		{
		case "1":
			userAccounts.put(name, new CheckingAccount(name, 0));
			break;
		case "2":
			userAccounts.put(name, new SavingsAccount(name, 0));
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
	}
	
	public static void calculatePay()
	{
		double basic  = 6.5;
		double otRate = 1.5;
		double taxRate = 0.048;
		double regHours = 40;
		double hours, gross, tax, nett;
		
		String name = "";
		do
		{
			System.out.println("Enter User Name");
			name = uin.nextLine();
		}
		while(userAccounts.get(name) == null);
		
		System.out.print("Enter # of hours worked: ");
		hours = Double.parseDouble(uin.nextLine());
			
		if(hours > regHours)
		{
			gross = ((hours - regHours) * otRate * basic) 
					+ (basic * regHours);
		}
		else
		{
			gross = hours * basic;
		}
		tax = gross * taxRate;
		nett = gross - tax;

		System.out.format("Gross Pay:\t$ %7.2f\n", gross);
		System.out.format("(-) Tax:\t$ %7.2f\n", tax);
		System.out.format("Nett Pay:\t$ %7.2f\n", nett);
		
		Account currentActive = userAccounts.get(name);
		if(currentActive.deposit(nett))
			System.out.println("Deposit successful");
		else
			System.out.println("Problems depositing");
		
		System.out.println("Press enter to continue...");
		uin.nextLine();
	}

	public static void listUsers()
	{
		System.out.println("Sort By:");
		System.out.println("(1) ID");
		System.out.println("(2) Name");
		System.out.println("Choice: ");
		
		Comparator<Account> idSorter = (a,b)->a.getId()-b.getId();
		
		Comparator<Account> nameSorter = (a,b)->a.getHolderName().compareTo(b.getHolderName());
		
		switch(uin.nextLine())
		{
		case "1":
			displayUsers(idSorter);
			break;
		case "2":
			displayUsers(nameSorter);
			break;
		default:
			System.out.println("Invalid Entry...");
			break;
		}
	}
	
	public static void displayUsers(Comparator<Account> sorter)
	{
		List<Account> accList = new ArrayList<>();
		accList.addAll(userAccounts.values());
		
		Collections.sort(accList,sorter);
		
		for(Account temp : userAccounts.values())
		{
			System.out.format("%d - %s (%10.2f)\n",temp.getId(),temp.getHolderName(),temp.getBalance());
		}
		System.out.println("Press enter to continue...");
		uin.nextLine();
	}

	public static void main(String[] args) 
	{
		boolean quit = false;
		
		while(!quit)
		{
			displayMenu();
			switch(uin.nextLine())
			{
			case "1": registerUser();
				break;
			case "2": calculatePay();
				break;
			case "3": listUsers();
				break;
			case "x":
				quit = true;
				break;
			default:
				System.out.println("Invalid entry...");
			}
		}

	}

}








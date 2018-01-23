import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

import com.lazada.assets.Account;
import com.lazada.assets.CheckingAccount;
import com.lazada.assets.SavingsAccount;

class DBAction extends RecursiveAction
{

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex3Paymaster 
{
	private static final Scanner uin = new Scanner(System.in);
	private static Map<String,Account> userAccounts = new TreeMap<>();
	private static final String dataStorage = "./users.data";
	
	private static ForkJoinPool pool = ForkJoinPool.commonPool();
	private static Connection conn = null;
	private static Statement stmt = null;
	
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
		
		
		Optional<Statement> optStmt = Optional.ofNullable(stmt);
		switch(uin.nextLine())
		{
		case "1":
			//userAccounts.put(name, new CheckingAccount(name, 0));
			String sql=String.format("INSERT INTO users,accounts (users.userName,accounts.userID,accounts.accType,accounts.balance) VALUES ('%s',SELECT users.userID WHERE users.userName = '%s','%s','%.2f')",name,name,"checking",0.0);
			
				optStmt.ifPresent((x)->{
					try {
						x.executeUpdate(sql);
					} 
					catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
			break;
		case "2":
			String sql2=String.format("INSERT INTO users,accounts (users.userName,accounts.userID,accounts.accType,accounts.balance) VALUES ('%s',SELECT users.userID WHERE users.userName = '%s','%s','%.2f')",name,name,"savings",0.0);
			
				optStmt.ifPresent((x)->{
					try {
						x.executeUpdate(sql2);
					} 
					catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
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
		
//		Account currentActive = userAccounts.get(name);
//		if(currentActive.deposit(nett))
//			System.out.println("Deposit successful");
//		else
//			System.out.println("Problems depositing");
		
		try {
			stmt.executeUpdate(String.format("UPDATES accounts SET balance=%.2f WHERE userID=SELECT users.userID FROM users WHERE userName='%s'",nett,name));
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
//		List<Account> accList = new ArrayList<>();
//		accList.addAll(userAccounts.values());
//		
//		Collections.sort(accList,sorter);
//		
//		for(Account temp : userAccounts.values())
//		{
//			System.out.format("%d - %s (%10.2f)\n",temp.getId(),temp.getHolderName(),temp.getBalance());
//		}
		
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM users,accounts WHERE users.userID=accounts.userID");
			while(rs.next())
			{
				System.out.format("%d - %s ($ %.2f)\n",rs.getInt("users.userID"),rs.getString("users.userName"),rs.getDouble("accounts.balance"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Press enter to continue...");
		uin.nextLine();
	}

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/MyDB", "root", "");
			stmt = conn.createStatement();
		} 
		catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean quit = false;
		
		try(FileInputStream fis = new FileInputStream(dataStorage);
				ObjectInputStream ois = new ObjectInputStream(fis);)
		{
			Object temp = ois.readObject();
			if(temp instanceof Map<?,?>)
			{
				userAccounts = (Map<String,Account>)temp;
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found. Using local instance...");
			userAccounts = new TreeMap<>();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		
//		try(FileOutputStream fos = new FileOutputStream(dataStorage);
//				ObjectOutputStream oos = new ObjectOutputStream(fos);)
//		{
//			oos.writeObject(userAccounts);
//		} 
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}








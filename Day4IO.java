import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import com.lazada.assets.Customer;
import com.lazada.assets.Wallet;

public class Day4IO {

	public static void main(String[] args) 
	{
		Customer cust = new Customer("Mr / Mdm Customer");
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis = new FileInputStream("data.monkey");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object temp = ois.readObject();
			if(temp instanceof Customer)
			{
				Customer result = (Customer)temp;
				System.out.println(result.name);
				System.out.println(result.custWallet.balance);
			}
			
			ois.close();
			fis.close();
			
//			FileOutputStream fos = new FileOutputStream("data.monkey");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			
//			oos.writeObject(cust);
//			
//			oos.close();
//			fos.close();
			
//			FileInputStream fis = new FileInputStream("sample.txt");
//			Scanner fileIn = new Scanner(fis);
//			
//			String result = fileIn.nextLine();
//			System.out.println(result);
//			
//			fileIn.close();
//			fis.close();
			
//			FileOutputStream fos = new FileOutputStream("sample.txt");
//			PrintWriter pw = new PrintWriter(fos,false);
//			pw.println("The quick brown fox jumps over the lazy dog");
//			//pw.flush();
//			//pw.format(format, args)
//			pw.close();
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("No such file");
		} 
		catch (IOException e) 
		{
			System.out.println("Can't seem to write to this file");
			e.printStackTrace();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

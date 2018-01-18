import java.util.Scanner;

class TikiException extends Error
{
	public TikiException()
	{
		super("Tiki did a boo boo");
	}
}

public class Day2Exceptions 
{
	public static void doSomething() throws TikiException
	{
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner uin = new Scanner(System.in);
		
		//TRY / CATCH RULES
		//1) try blocks MUST be accompanied by a catch / finally block
		//2) No code in between blocks
		//3) Catch Blcoks must be arranged from most specific to least specific
		//4) Finally blocks will run regardless of exceptions
		int x, y;
		x = Integer.parseInt(uin.nextLine());
		
		doSomething();
		
		try
		{
			System.out.println("Enter a number");
			
			
			System.out.println("Enter another number");
			y = Integer.parseInt(uin.nextLine());
			
			int z = x / y;
			
			throw new TikiException();
		}
		//System.out.println("Lalalalala");
		catch(NumberFormatException err)
		{
			System.out.println("I said number, dimwit!");
		}
		catch(ArithmeticException err)
		{
			System.out.println("Apparently you have trouble counting");
		}
		catch(TikiException err)
		{
			System.out.println(err.getMessage());
		}
		catch(Exception tiki)
		{
			tiki.printStackTrace();
			//System.out.println("Something went wrong");
		}
		finally
		{
			System.out.println("This is the final stage of the exception");
			x = 10;
		}
		
		System.out.println("The program is still running");
	}

}







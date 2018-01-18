import java.util.Scanner;

public class Day1Operators {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Math Operators
//		() Brackets
//		% Modulus 25%3 = 1
//		/ Divide
//		* Multiply
//		+ Add
//		- Subtract
//		++ / -- Increment / Decrement
		
		double celcius = ((212 - 32) * 5) / 9;
		System.out.println(celcius++);//Add 1 after the line has been executed
		System.out.println(++celcius);//Add 1 before execution
		
//		Relational Operators
//		== Same as
//		!= Not same as
//		> More than
//		< Less than
//		>= More than or equal to
//		<= Less than or equal to
		
//		Logical Operators
//		&& And
//		|| Or
//		! Not
		
		Scanner uinput = new Scanner(System.in);
		
		
		int x = Integer.parseInt(uinput.nextLine());
		double y = Double.parseDouble(uinput.nextLine());
		if(x != y && (y < 10 || x == 5))
		{
			System.out.println("True Statement");
		}
		else
		{
			System.out.println("False Statement");
		}
	}

}










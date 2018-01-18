import java.util.Scanner;

public class Ex1Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double basic  = 6.5;
		double otRate = 1.5;
		double taxRate = 0.048;
		double regHours = 40;
		double hours, gross, tax, nett;
		boolean quit = false;
		
		Scanner uin = new Scanner(System.in);
		
		while(!quit)
		{
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
			
	//		String output = "";
	//		output.format("Gross Pay:\t$ %.2f", gross);
			
			System.out.format("Gross Pay:\t$ %7.2f\n", gross);
			System.out.format("(-) Tax:\t$ %7.2f\n", tax);
			System.out.format("Nett Pay:\t$ %7.2f\n", nett);
			
			System.out.println("Another calculation?y/n");
			String choice = uin.nextLine();
			switch(choice.toLowerCase())
			{
			case "y":
			case "yes":
				quit = false;
				//continue;
				break;
			case "n":
			case "no":
				quit = true;
				break;
				//break;
			default:
				System.out.println("Invalid Entry. Exiting...");
				quit = true;
				break;
			}
		}
	}

}







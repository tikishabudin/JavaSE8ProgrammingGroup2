import com.lazada.assets.Account;
import com.lazada.assets.CheckingAccount;
import com.lazada.assets.SavingsAccount;

public class Ex2BankAccounts {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account obj = new SavingsAccount("Tiki Shabudin", 1000);
		if(obj.deposit(500))
		{
			System.out.format("Account: %s, Balance: %.2f\n",
					obj.getHolderName(),
					obj.getBalance());
		}
		
		if(obj.withdraw(5000))
		{
			System.out.format("Account: %s, Balance: %.2f\n",
					obj.getHolderName(),
					obj.getBalance());
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
		System.out.format("Account: %s, Balance: %.2f\n",
				obj.getHolderName(),
				obj.getBalance());

	}

}

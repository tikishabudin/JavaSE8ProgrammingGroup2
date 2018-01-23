import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.lazada.assets.Monkey;

class Processing implements Closeable
{

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Closing this object");
	}
	
}

public class Day4TryWithResources 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try(
				Processing obj = new Processing();
//				FileOutputStream fos = new FileOutputStream("./sample.txt");
//				ObjectOutputStream oos = new ObjectOutputStream(fos);
		)
		{
			Integer.parseInt("alkjhfsakldjfhl");
			System.out.println("Doing something in the try block");
			//Do some operations
			//Something happens here
		}
		catch(Exception err)
		{
			System.out.println("Something went wrong");
		}
	}

}

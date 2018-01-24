import java.util.Scanner;

class CollectableObject
{
	public CollectableObject()
	{
		System.out.println("Object created");
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Object destroyed / collected");
	}
}

public class Day7GarbageCollector {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CollectableObject obj1 = new CollectableObject();
		CollectableObject obj2 = new CollectableObject();
		CollectableObject obj3 = new CollectableObject();
		obj1 = null;
		obj2 = null;
		System.gc();
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

}

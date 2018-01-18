
//interface Iface
//{
//	void doSomething();
//}

public class Day1Functions {
	
//	public static void otherfx(Iface fx)
//	{
//		fx.doSomething();
//	}
	
	public static void doSomething()
	{
		return;
	}
	
	public static String[] createString()
	{
		if(true)
			return null;
//		return new String[]{"A string", "Your string", "My String"};
		//else
		System.out.println("Bye bye");
		return new String[5];
		
		//RETURN RULES
		//1) return value and return type MUST be consistent
		//2) can return 1 value / 1 set of values
		//3) return statements terminate functions
	}
	
	public static void fxname(int param, String param2)
	{
		if(param2 == null)
		{
			param2 = "Default value ";
		}
		//do this
		//do that
		System.out.println(param2 + param);
	}

	public static void main(String[] args) {
		int x = 5;
		// TODO Auto-generated method stub
		fxname(x,"This is a number ");
		System.out.println("This is in the main...");
		fxname(25, null);
		
		String[] result = createString();//String result = "String created";
		System.out.println(result);
		//otherfx(()->{});
	}

}



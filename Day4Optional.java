import java.util.Optional;

class OptionalDemo
{
	public void doSomething()
	{
		System.out.println("Optional Demo Object doing something");
	}
	
	public String getValue()
	{
		return "Whatever";
	}
	
	public Optional<OptionalDemo> whateverYouWant()
	{
		//Whatever you need to do
		return Optional.ofNullable(this);
	}
}

interface IFunction<T,R>
{
	R ifx(T param);
}

public class Day4Optional {
	
	public static String process(Integer i)
	{
		return "Some string";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IFunction<Integer,String> fxObj = Day4Optional::process;
		System.out.println(fxObj.ifx(10));
		
		OptionalDemo obj = new OptionalDemo();
		//obj = null;
		
		//Optional<OptionalDemo> optDemoObj = Optional.of(new OptionalDemo());
		Optional<OptionalDemo> optDemoObj = Optional.empty();
		optDemoObj = Optional.ofNullable(obj);
		
		optDemoObj.ifPresent((x)->{
			x.doSomething();
		});
		
		System.out.println(optDemoObj
				.flatMap(OptionalDemo::whateverYouWant)
				.map(OptionalDemo::getValue)
				.get());
	}

}










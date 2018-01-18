import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface IDemo<P,R>
{
	R demoProcess(P param1, P param2);
}

public class Day4FunctionalInterfaces {

	public static void main(String[] args) 
	{
		Function<String, String> fx = (x)->{
			return "Your Entered: " + x;
		};
		
		System.out.println(fx.apply("55555"));
		
		Predicate<Integer> pred = (x)->{
			int a = x;
			if(a > 10)
				return true;
			return false;
		};
		System.out.println(pred.test(25));
		
		Supplier<Double> supp = ()->{
			return 20.3;
		};
		
		System.out.println(supp.get());
		
		Consumer<String> cons = (x)->{
			System.out.println("Consumed: " + x);
		};
		
		cons.accept("1 Apple");
		// TODO Auto-generated method stub
//		IDemo<String,Boolean> demoFx = (p1,p2)->{
//			return true;
//		};
//
//		System.out.println(demoFx.demoProcess("this", "that"));
	}

}

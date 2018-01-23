
import java.util.concurrent.atomic.*;

public class Day5Atomic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicInteger i = new AtomicInteger(10);
		i.set(15);
		System.out.println(i.get());
		
		AtomicIntegerArray aia = new AtomicIntegerArray(10);
		aia.set(0, 25);
		System.out.println(aia.decrementAndGet(0));
	}

}

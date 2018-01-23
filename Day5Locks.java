import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

public class Day5Locks {

	public static void main(String[] args) 
	{
		//ReentrantLock lock = new ReentrantLock();
		//ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
		StampedLock lock = new StampedLock();
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newCachedThreadPool();
		
		
		es.submit(()->{
			
			long code = lock.writeLock();
			System.out.println("First task excuting");
			System.out.println("1)Lock is valid: " + lock.validate(code));
			System.out.println("1)Lock code is: " + code);
			System.out.println("1)===========================================");
			lock.unlock(code);
		});
		es.submit(()->{
			long code = lock.readLock();
			code = lock.tryConvertToWriteLock(code);
			System.out.println("Second task excuting");
			System.out.println("2)Lock is valid: " + lock.validate(code));
			System.out.println("2)Lock code is: " + code);
			System.out.println("2)===========================================");
			//lock.unlock(code);			
		});
		es.submit(()->{
			long code = lock.readLock();
			System.out.println("Third task excuting");
			System.out.println("3)Lock is valid: " + lock.validate(code));
			System.out.println("3)Lock code is: " + code);
			System.out.println("3)===========================================");
			//lock.unlock(code);
		});
	}

}

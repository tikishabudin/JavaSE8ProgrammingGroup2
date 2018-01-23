import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

class Simultaneous implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Running simultaneously");
//			try 
//			{
//				Thread.sleep(500);
//			} 
//			catch (InterruptedException e) 
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
}

class SimulReturn implements Callable<String>
{

	@Override
	public String call() throws Exception {
		System.out.println("Do Something");
		return "Done";
	}
	
}

public class Day5Concurrency {

	public static void main(String[] args) 
	{
		ThreadFactory tf = new ThreadFactory() {
			
			private int numCount = 0;
			
			@Override
			public Thread newThread(Runnable r) {
				
				return new Thread(r,"Thread#" + numCount++);
			}
		};
		
		ExecutorService es = Executors.newFixedThreadPool(10,tf);
		//ExecutorService es = Executors.newSingleThreadExecutor();
		//ExecutorService es = Executors.newCachedThreadPool(tf);
		Future<String> result = es.submit(new SimulReturn());
		es.submit(new Simultaneous());
		es.submit(new Simultaneous());
		es.submit(new Simultaneous());
		es.submit(new Simultaneous());
		es.submit(new Simultaneous());
		Future<String> runResult = es.submit(new Simultaneous(), "Done wth runnable");
		Future<?> obj = es.submit(new Simultaneous());
		try {
			System.out.println(result.get());
		} 
		catch (InterruptedException | ExecutionException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
//		Thread job1 = new Thread(new Simultaneous());
//		Thread job2 = new Thread(()->{
//			for(int i = 0; i < 3; i++)
//				System.out.println("Running job2.");
//		});
//		
//		job1.start();
//		job2.start();
//		
////		try 
////		{
////			job2.join();
////		} 
////		catch (InterruptedException e1) 
////		{
////			// TODO Auto-generated catch block
////			e1.printStackTrace();
////		}
//		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Running main...");
//			try 
//			{
//				Thread.sleep(500);
//			} 
//			catch (InterruptedException e) 
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		Scanner uin = new Scanner(System.in);
		uin.nextLine();
	}

}






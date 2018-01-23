import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

class MyAction extends RecursiveAction
{
	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		System.out.println("This is an action");
	}	
}

class MyTask extends RecursiveTask<Integer>
{

	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}

public class Day6Parallels {

	public static void main(String[] args) 
	{	
		// TODO Auto-generated method stub
		ForkJoinPool fjp = ForkJoinPool.commonPool();
		//ForkJoinPool fjp = new ForkJoinPool(2);
		
		System.out.println(fjp.getParallelism() + " cores executing");
		fjp.invoke(new MyAction());
		Future<Integer> x = fjp.submit(new MyTask());
		fjp.invoke(new MyTask());
		
		List<Callable<Integer>> tasks = new ArrayList<>();
		tasks.add(()->{
			System.out.println("Task 1 running...");
			return 1;
		});
		tasks.add(()->{
			System.out.println("Task 2 running...");
			return 1;
		});
		tasks.add(()->{
			System.out.println("Task 3 running...");
			return 1;
		});
		tasks.add(()->{
			System.out.println("Task 4 running...");
			return 1;
		});
		tasks.add(()->{
			System.out.println("Task 5 running...");
			return 1;
		});
		int sum = 0;
		List<Future<Integer>> futureSums = fjp.invokeAll(tasks);
		for(Future<Integer> num: futureSums)
		{
			try 
			{
				sum += num.get();
			} catch (InterruptedException | ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		System.out.println("The sum is " + sum);
		
		fjp.shutdown();
		try {
			fjp.awaitTermination(30,TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}









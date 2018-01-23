import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkSync implements Runnable
{
	public static String dataStr = "";
	private static boolean canRead = false;

	public WorkSync(boolean setRead)
	{
		canRead = setRead;
	}
	
	public synchronized void setString(String x)
	{
		dataStr = x; 
	}
	
	public synchronized String readStr()
	{
		return dataStr;
	}
	
	public void doSomething()
	{
		//Some pre-processing
		
		synchronized (this) 
		{
			
		}
		
		//SOme finalization code
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		if(canRead)
//			readStr();
//		else
//			setString("New Value");
		this.doSomething();
	}
	
}

public class Day5Synchronized {

	public static void main(String[] args) {
		WorkSync obj = new WorkSync(true);
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newCachedThreadPool();
		es.submit(obj);
		es.submit(obj);
		es.submit(obj);
		es.submit(obj);
	}

}

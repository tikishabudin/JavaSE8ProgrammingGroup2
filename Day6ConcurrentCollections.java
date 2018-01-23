import java.util.concurrent.*;

public class Day6ConcurrentCollections {

	public static void main(String[] args)
	{
		ConcurrentHashMap<String, String> countries = new ConcurrentHashMap<>();
		
		ExecutorService exs = Executors.newCachedThreadPool();
		
		exs.submit(()->{
			countries.put("my", "Malaysia");
		});
		exs.submit(()->{
			countries.put("th", "Thailand");
		});
		exs.submit(()->{
			countries.put("id", "Indonesia");
		});
		exs.submit(()->{
			countries.put("ph", "Phillipines");
		});
		exs.submit(()->{
			for(String country:countries.values())
				System.out.println(country);
		});
		
		exs.shutdown();
		
		try 
		{
			if(!exs.awaitTermination(30, TimeUnit.SECONDS))
			{
				exs.shutdownNow();
			}
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-------------------------------------------");
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> wordList = new CopyOnWriteArrayList<>();
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		es.submit(()->{
			wordList.add("Cats");
		});
		es.submit(()->{
			wordList.add("Ball");
		});
		es.submit(()->{
			wordList.add("Dog");
		});
		es.submit(()->{
			wordList.add("Book");
		});
		es.submit(()->{
			wordList.add("Honey");
		});
		
		es.submit(()->{
			for(String word : wordList)
				System.out.println(word);
		});
		
	}

}

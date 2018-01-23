import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day6Streams 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> participants =  new ArrayList<>();
		participants.add("Trung");
		participants.add("Ly");
		participants.add("Slava");
		participants.add("Sujith");
		participants.add("Tin");
		participants.add("Nguyen");
		participants.add("Nguyen");
		participants.add("Nguyen");
		participants.add("Nguyen");
		participants.add("Nguyen");
		//Stream<String> strStream = Stream.of("Item 1","Item 2","Item 3","Item 4");
		
		Stream<String> partStream = participants.stream();
		
//		List<String> resultList =  partStream
//		.map(String::toUpperCase)
//		.parallel()
//		.filter((x)-> x.contains("A"))
//		.distinct()
//		.collect(Collectors.toList());
		
		//IntSummaryStatistics result =  partStream
		String result = partStream
				.map(String::toUpperCase)
				
				//.filter((x)-> x.contains("A"))
				.distinct()
				.parallel()
				.collect(Collectors.joining("','", "['", "']"));
				//.collect(Collectors.summarizingInt(str->str.length()));
		
		System.out.println(result);
		
//		Collections.sort(resultList);
//		for(String result : resultList)
//		{
//			System.out.println(result);
//		}
		
		System.out.println("--------------------------------------------");
		
		partStream = participants.stream();
		partStream.forEach((x)->{
			System.out.println(x);
		});
	}

}






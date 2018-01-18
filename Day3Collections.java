import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

class SampleData
{
	private int data;
	public String name;
	private int id;
	
	public SampleData(int x,String name, int setID)
	{
		this.name = name;
		this.data = x;
		this.id = setID;
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("Checking hashCode...");
		return this.id;
	}
	
	@Override
	public boolean equals(Object o)
	{
		System.out.println("Checking equals...");
		return false;
	}
}

public class Day3Collections {

	public static void main(String[] args) {
		
		Map<String, String> countries = new TreeMap<>();
		countries.put("vn", "Vietnam");
		countries.put("ru", "Russia");
		countries.put("lk", "Sri Lanka");
		countries.put("th", "Thailand");
		countries.put("in", "India");
		countries.put("my", "Malaysia");
		
//		System.out.println(countries.get("th"));
		
//		ArrayList<String> sortedList = new ArrayList();
//		sortedList.addAll(countries.keySet());
//		
//		Collections.sort(sortedList);
		
		for(String country : countries.keySet())
		{
			System.out.println(countries.get(country));
		}
		
//		Stack<String> magazine = new Stack<>();
//		magazine.push("Item 1");
//		magazine.push("Item 2");
//		magazine.push("Item 3");
//		magazine.push("Item 4");
//		magazine.push("Item 5");
//		
//		System.out.println(magazine.pop());
//		System.out.println("---------------------------------------");
//		
//		Iterator<String> iter = magazine.iterator();
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		
//		Deque<String> lineup = new LinkedList<>();
//		lineup.add("Item 1");
//		lineup.add("Item 2");
//		lineup.add("Item 3");
//		lineup.add("Item 4");
//		lineup.add("Item 5");
//		lineup.addFirst("Item 0");
//		
//		//System.out.println(lineup.peek());
//		System.out.println(lineup.peekLast());
//		System.out.println("----------------------------------");
//		for(String item : lineup)
//		{
//			System.out.println(item);
//		}
		
//		Set<SampleData> dataSet = new HashSet<>();
//		dataSet.add(new SampleData(10,"Moe",1));
//		dataSet.add(new SampleData(20,"Larry",1));
//		dataSet.add(new SampleData(20,"Curly",1));
//		
//		SampleData temp = new SampleData(30, "John", 2);
//		dataSet.add(temp);
//		
//		SampleData[] dataArray = new SampleData[dataSet.size()];
//		dataSet.toArray(dataArray);
//		
//		System.out.println(dataArray[2].name);
		
//		for(SampleData x : dataArray)
//		{
//			System.out.println(x.name);
//		}
		
		
//		Set<String> people = new HashSet<String>();
//		people.add("Tiki Shabudin");
//		people.add("Johanne Shabudin");
//		people.add("Shamoon Shabudin");
//		people.add("Jenny Shabudin");
//		people.add("Mohd Sidek Shabudin");
//		people.add("Tiki Shabudin");
//		people.add("Tiki Shabudin");
//		people.add("Tiki Shabudin");
//		
//		for(String person : people)
//		{
//			System.out.println(person);
//		}
		
		// TODO Auto-generated method stub
//		List<String> fruits = new ArrayList<>();
//		fruits.add("Apples");
//		fruits.add("Oranges");
//		fruits.add("Grapes");
//		fruits.add("Bananas");
//		fruits.add("Durians");
//		fruits.add("Durians");
//		
//		ArrayList<String> moreFruits = new ArrayList<>();
//		moreFruits.add("Peaches");
//		moreFruits.add("Guavas");
//		fruits.addAll(moreFruits);
//		
//		
//		fruits.add(3, "Rambutans");
//		fruits.remove(fruits.indexOf("Durians"));
//		fruits.remove(fruits.indexOf("Durians"));
//		
//		Iterator<String> iter = fruits.iterator();
		
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		
		//System.out.println(fruits.indexOf("Grapes"));
//		for(String fruit: fruits)
//		{
//			System.out.println(fruit);
//		}
	}

}







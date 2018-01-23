import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Day5SyncLocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");
		
		Iterator<String> i = list.iterator();
		
		int counter = 0;
		
		while(i.hasNext())
		{
			counter++;
			if(counter == 3)
				list.remove(3);
			System.out.println(i.next());
		}
	}

}







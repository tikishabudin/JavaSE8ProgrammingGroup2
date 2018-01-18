import com.lazada.assets.Monkey;

public class Day2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = " These are some words ";
		String other = "These are some words";
		
		//words = words + ". And so are these";
		Monkey obj1 = new Monkey("Obj", 10);
		Monkey obj2 = new Monkey("Obj", 10);
		
		int x = 5, y = 5;
		if(words.equals(other))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		
		System.out.println(words
				.toUpperCase()
				.trim()
				.format("Whatever", null).concat(". Something else"));
//		System.out.println(words.toUpperCase()
//				.substring(4, 10));
		
		StringBuilder strBuilder = new StringBuilder(200);
		strBuilder.append("Hello, my name is Tiki.");
		strBuilder.append(" This is my story.");
		strBuilder.append(" It is very long.");
		strBuilder.append(" The end.");
		strBuilder.insert(5, "This is going in the middle");
		
		String result = strBuilder.toString();
		System.out.println(result);
	}

}









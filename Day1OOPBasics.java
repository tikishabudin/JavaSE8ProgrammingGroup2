import com.lazada.assets.Monkey;

public class Day1OOPBasics 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Monkey tiki = new Monkey("Tiki Shabudin", 50);
		Monkey maksim = new Monkey();
		
		tiki.eating();
		maksim.eating(false);
		
		tiki.eating("I don't know what");
	}

}




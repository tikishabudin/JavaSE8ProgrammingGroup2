enum Day
{
	Monday(1),
	Tuesday(2),
	Wednesday(3),
	Thursday(4),
	FRIDAY(5),
	Saturday(6),
	sunday(7);
	
	private int daynum;
	
	private Day(int setNum)
	{
		this.daynum = setNum;
	}
}

enum Color
{
	BLACK("Not technically a color, just an absence of light"),
	WHITE("More light. Not a color"),
	RED("Fastest light wave"),
	GREEN("Eat your vegetables"),
	BLUE("The color of most oceans"),
	TIKI("We're not quite sure what color this is, but it's furry and brown");
	
	private String description;
	
	private Color(String x)
	{
		this.description = x;
	}
	
	public String getDesc()
	{
		return description;
	}
}

class Data
{
	public String info;
}

public class Day3Enums {
	
	public static void processColor(Color trans)
	{
//		trans = Color.BLUE;
//		trans.info = "set dolorum";
		System.out.println("-----------------------------------");
		System.out.println(trans);
		trans = Color.GREEN;
		System.out.println(trans);
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
//		Data obj = new Data();
//		obj.info = "Lorem Ipsum";
//		
//		String x = "test";
//		
//		processColor(x);
//		System.out.println(x);
		// TODO Auto-generated method stub
		Color myfav = Color.TIKI;
//		System.out.println(myfav.getDesc());
		processColor(myfav);
		System.out.println(myfav);
	}

}









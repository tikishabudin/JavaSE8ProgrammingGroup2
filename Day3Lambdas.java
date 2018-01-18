@FunctionalInterface
interface SomeFace
{
	void doStuff(Day3Lambdas obj);
}

interface MathFace
{
	int add(int x, int y);
}

public class Day3Lambdas {
	
	Day3Lambdas refer;
	
	public void process(SomeFace obj)
	{
		this.refer = this;
		obj.doStuff(this.refer);
	}

	public static void main(String[] args) {
		MathFace adder = (x,y)-> {
			System.out.println(x+y);
			return x+y;
		};
		
		Day3Lambdas temp = new Day3Lambdas();
		
		temp.process(
				x->System.out.println("This object is of type: " 
						+ x.getClass().getSimpleName())
				);
		
//		int a = 10;
//		//a++;
//		// TODO Auto-generated method stub
//		SomeFace obj = ()->{
//			System.out.println("This is the lambda with: " + a);
//		};
//		
//		obj.doStuff();
	}

}






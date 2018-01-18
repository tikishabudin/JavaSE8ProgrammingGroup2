
interface MyFace
{
	void doThis();
	int doThat();
}

class Sample implements MyFace
{

	@Override
	public void doThis() {
		// TODO Auto-generated method stub
		System.out.println("Part of: " + this.getClass().getSimpleName());
	}

	@Override
	public int doThat() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class Day3AnonymousnLambdas {

	public static void process(MyFace x)
	{
		x.doThis();
	}
	
	public static void main(String[] args) {
		int a = 10;
		process(new MyFace() {
			@Override
			public void doThis()
			{
				System.out.println(a);
			}
			
			@Override
			public int doThat()
			{
				return 0;
			}
		});
		// TODO Auto-generated method stub
//		MyFace refer = new MyFace() {
//			
//			@Override
//			public void doThis() {
//				// TODO Auto-generated method stub
//				System.out.println("This is being called from inside the class: " + this.getClass().getSimpleName());
//			}
//			
//			@Override
//			public int doThat() {
//				// TODO Auto-generated method stub
//				System.out.println("Anonymous doThat");
//				return 0;
//			}
//		};
//		
//		refer.doThat();
//		refer.doThis();
//		
//		Sample obj = new Sample();
//		obj.doThis();
//
//
	}

}

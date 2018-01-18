import com.lazada.assets.Child;
import com.lazada.assets.Parent;

public class Day2Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		Child obj2 = new Child();
		System.out.println("-----------------------------------");
		obj.doSomething();
		obj.doSomething("Something");
		System.out.println(obj);//Object.toString();
//		obj.play();
		if(obj.equals(obj2))
		{
			
		}
	}

}

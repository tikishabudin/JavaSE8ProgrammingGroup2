import com.lazada.assets.Child;
import com.lazada.assets.OtherChild;
import com.lazada.assets.Parent;

public class Day2Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent refer = new Child();
		refer = new OtherChild();
		//Parent sample = new Parent();
		
		Parent[] listofObjects = new Parent[10];
		listofObjects[0] = new Child();
		listofObjects[1] = new OtherChild();
		
		//OtherChild obj = new OtherChild();
		//obj.doSomething();
		
		if(listofObjects[0] instanceof Child)
		{
			Child current = (Child)listofObjects[0];
			current.play();
		}
	}

}



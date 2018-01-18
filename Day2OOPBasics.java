import com.lazada.assets.Monkey;

public class Day2OOPBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Monkey.numMonkeys);
		Monkey.showMonkeys();
		Monkey obj = new Monkey("Monkey Object",10);
		Monkey refer = obj;
		Monkey obj2 = new Monkey();
//		System.out.println(refer.getName());
		Monkey.showMonkeys();
		//obj.numMonkeys = 100;
		//System.out.println(Monkey.numMonkeys);
		
		obj = null;
		refer = null;
		
		System.gc();
	}

}

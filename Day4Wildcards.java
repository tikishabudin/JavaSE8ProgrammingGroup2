import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.lazada.assets.Child;
import com.lazada.assets.Iface;
import com.lazada.assets.OtherChild;
import com.lazada.assets.Parent;

class Custom<T>
{
	public List<T> doSomething(List<? extends T> obj)
	{
		//Do something to obj
		return new ArrayList<T>();
	}
}

public class Day4Wildcards {

	public static <T> void process(Custom<? extends T> obj)
	{
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Custom<Parent> something = new Custom<Parent>();
		something.doSomething(new ArrayList<Child>());
	}

}






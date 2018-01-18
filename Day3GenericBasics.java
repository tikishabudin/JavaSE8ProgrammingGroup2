import com.lazada.assets.Child;
import com.lazada.assets.Iface;
import com.lazada.assets.OtherChild;
import com.lazada.assets.Parent;

class TikiMath<T extends Iface,U>
{
	public T add(T x, U y)
	{
		return x;
	}
}

public class Day3GenericBasics
{
	public <T,U> Day3GenericBasics(U param,T param2)
	{
		//throw new ClassCastException();
	}
	
	public static <T extends Parent,U> T something(T param1, U param2)
	{
		return param1;
	}

	public static void main(String[] args) 
	{
		TikiMath<OtherChild,Child> mathObj = new TikiMath<>();
		OtherChild result = mathObj.add(new OtherChild(),new Child());
		result.doSomething();
		
		something(new Child(),null);
	}

}






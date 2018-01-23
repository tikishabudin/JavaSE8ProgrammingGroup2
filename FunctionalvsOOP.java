//OOP
class Storage
{
	private String storedString;
	
	public String getStoredString() {
		return storedString;
	}

	public void setStoredString(String storedString) {
		this.storedString = storedString;
	}
}

//Functional
interface Doing
{
	void doSomething();
}

public class FunctionalvsOOP
{
	//Functional implementation
	static Doing doObj = ()->{
		
	};
	
	
	String stroredString;
	
	public static void specificTask(String param)
	{
		doObj.doSomething();
		System.out.println(param);
	}

	public static void main(String[] args) 
	{
		//OOP Implementation
		Storage obj = new Storage();//Encapsulation
		
		obj.setStoredString("Stored");
		System.out.println(obj.getStoredString());
		
		// TODO Auto-generated method stub
		specificTask("This is a string");
	}

}

package methodsOverriding;

public class Method2 extends Method1
{
	
	static void vikram()
	{
		System.out.println("Child Classs method");
	}
	
	void niki()
	{
		System.out.println("Child Class Niki method is running");
	}
	public static void main(String[] args)
	{
		Method2 object = new Method2();
		vikram();
		object.niki();
	}

}



package polymorphism;

public class Overriding2 extends Overriding1 {
	
	
	public void m1()
	{
		super.m1();
		System.out.print("Child class method overriding");
	}
	
	public static void main(String[] args)
	{
		Overriding2 obj = new Overriding2();
		obj.m1();
	}

}
